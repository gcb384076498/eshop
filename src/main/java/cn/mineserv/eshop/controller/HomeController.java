package cn.mineserv.eshop.controller;


import cn.mineserv.eshop.model.Category;
import cn.mineserv.eshop.example.CategoryExample;
import cn.mineserv.eshop.model.Goods;
import cn.mineserv.eshop.example.GoodsExample;
import cn.mineserv.eshop.service.CategoryService;
import cn.mineserv.eshop.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Y_YuanZhouLv
 */
@Controller
public class HomeController{
    @Resource
    private GoodsService goodsService;
    @Resource
    private CategoryService categoryService;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response) {

        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria categoryExampleCriteria = categoryExample.createCriteria();
        categoryExampleCriteria.andParentidIsNull();
        List<Category> categoryList = categoryService.selectByExample(categoryExample);
        for (Category category : categoryList) {
            categoryExample.clear();
            categoryExampleCriteria = categoryExample.createCriteria();
            categoryExampleCriteria.andParentidEqualTo(category.getCateId());
            List<Category> childCategory = categoryService.selectByExample(categoryExample);
            for (Category child: childCategory) {
                GoodsExample goodsExample = new GoodsExample();
                GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
                goodsExampleCriteria.andCateIdEqualTo(child.getCateId());
                child.setGoodsList(goodsService.selectByExample(goodsExample));
            }
            category.setChildCategory(childCategory);


        }

        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
        goodsExampleCriteria.andIstodayEqualTo(true);
        List<Goods> todayGoodsList = goodsService.selectByExample(goodsExample);


        GoodsExample goodsExample1 = new GoodsExample();
        goodsExample1.setOrderByClause("goods_sales desc limit 5");
        List<Goods> hotGoodsList = goodsService.selectByExample(goodsExample1);

        request.setAttribute("todayGoodsList",todayGoodsList);
        request.setAttribute("hotGoodsList", hotGoodsList);
        request.setAttribute("categoryList", categoryList);
        return "home";
    }

    @RequestMapping(value = "/index.action",method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return home(request, response);
    }
}
