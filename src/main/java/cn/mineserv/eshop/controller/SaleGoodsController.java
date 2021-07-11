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
public class SaleGoodsController {
    private final String SALE_GOODS = "/goods/saleGoods";
    @Resource
    private GoodsService goodsService;
    @RequestMapping("/goods/saleGoods")
    public String doGet(HttpServletRequest request, HttpServletResponse response) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.setOrderByClause("goods_sales desc");
        GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
        goodsExampleCriteria.andGoodsSalesNotEqualTo(0);
        List<Goods> salesGoods = goodsService.selectByExample(goodsExample);
        request.setAttribute("salesGoods", salesGoods);
        return "goods/saleGoods";
    }
 
}
