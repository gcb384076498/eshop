package cn.mineserv.eshop.controller;


import cn.mineserv.eshop.example.GoodsExample;
import cn.mineserv.eshop.model.Cart;
import cn.mineserv.eshop.model.Goods;
import cn.mineserv.eshop.service.CategoryService;
import cn.mineserv.eshop.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
    public String home(Model map, HttpSession session) {

        AllController.getAllCategoryList(map, categoryService, goodsService);

        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
        goodsExampleCriteria.andIstodayEqualTo(true);
        List<Goods> todayGoodsList = goodsService.selectByExample(goodsExample);


        GoodsExample goodsExample1 = new GoodsExample();
        goodsExample1.setOrderByClause("goods_sales desc limit 0,6");
        List<Goods> hotGoodsList = goodsService.selectByExample(goodsExample1);

        map.addAttribute("todayGoodsList",todayGoodsList);
        map.addAttribute("hotGoodsList", hotGoodsList);
        List<Cart> cartList = AllController.getCartListFromSession(session);
        session.setAttribute("cartList", cartList);
        return "home";
    }



    @RequestMapping(value = "/index.action",method = RequestMethod.GET)
    public String index(Model map, HttpSession session) {
        return home(map,session);
    }
}
