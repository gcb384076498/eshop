package cn.mineserv.eshop.controller;

import cn.mineserv.eshop.example.GoodsExample;
import cn.mineserv.eshop.model.Goods;
import cn.mineserv.eshop.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Y_YuanZhouLv
 */
@Controller
public class NewestGoodsController {
    private final String NEWEST_GOODS = "/goods/newestGoods";
    @Resource
    private GoodsService goodsService;
    @RequestMapping("/goods/newestGoods")
    public String doGet(HttpServletRequest request, HttpServletResponse response) {
        
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.setOrderByClause("goods_date desc limit 9");
        List<Goods> newGoods = goodsService.selectByExample(goodsExample);
        request.setAttribute("newGoods", newGoods);
        return "goods/newestGoods";
    }
 
}
