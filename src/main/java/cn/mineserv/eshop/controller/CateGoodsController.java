package cn.mineserv.eshop.controller;

import cn.mineserv.eshop.example.CategoryExample;
import cn.mineserv.eshop.model.Category;
import cn.mineserv.eshop.model.Goods;
import cn.mineserv.eshop.example.GoodsExample;
import cn.mineserv.eshop.service.CategoryService;
import cn.mineserv.eshop.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Y_YuanZhouLv
 */
@Controller
public class CateGoodsController {
    private final String SALE_GOODS = "/goods/cateGoods";
    @Resource
    private GoodsService goodsService;
    @Resource
    private CategoryService categoryService;
    @RequestMapping("/goods/cateGoods/{childId}")
    public String doGet(HttpServletRequest request, HttpServletResponse response, @PathVariable("childId") Integer childId) {
        
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.setOrderByClause("goods_date desc");
        GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
        goodsExampleCriteria.andCateIdEqualTo(childId);
        List<Goods> goodsList = goodsService.selectByExample(goodsExample);

        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria categoryExampleCriteria = categoryExample.createCriteria();
        categoryExampleCriteria.andParentidIsNull();
        List<Category> categoryList = categoryService.selectByExample(categoryExample);
        List<Category> categorys = new ArrayList<>();
        for (Category category : categoryList) {
            categoryExample.clear();
            categoryExampleCriteria = categoryExample.createCriteria();
            categoryExampleCriteria.andParentidEqualTo(category.getCateId());
            List<Category> childCategory = categoryService.selectByExample(categoryExample);
            categorys.addAll(childCategory);
            category.setChildCategory(childCategory);
        }
        request.setAttribute("categories", categorys);
        request.setAttribute("childId", childId);
        request.setAttribute("goodsList", goodsList);

        return "/goods/cateGoods";
    }
 
}
