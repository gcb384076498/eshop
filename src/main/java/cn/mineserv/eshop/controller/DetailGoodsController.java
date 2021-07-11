package cn.mineserv.eshop.controller;

import cn.mineserv.eshop.example.GoodsDetailExample;
import cn.mineserv.eshop.example.GoodsDetailTypeExample;
import cn.mineserv.eshop.example.PicExample;
import cn.mineserv.eshop.model.Category;
import cn.mineserv.eshop.model.Goods;
import cn.mineserv.eshop.model.GoodsDetail;
import cn.mineserv.eshop.model.GoodsDetailType;
import cn.mineserv.eshop.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @author Y_YuanZhouLv
 */
@Controller
public class DetailGoodsController {
    private final String SALE_GOODS = "/goods/goods_detail";
    @Resource
    private GoodsService goodsService;
    @Resource
    private CategoryService categoryService;
    @Resource
    private PicService picService;
    @Resource
    private GoodsDetailTypeService goodsDetailTypeService;
    @Resource
    private GoodsDetailService goodsDetailService;
    @RequestMapping("/goods/goodsDetail/{goodsId}")
    public String doGet(HttpServletRequest request, HttpServletResponse response, @PathVariable("goodsId") Integer goodsId) {
        Goods goods = goodsService.selectByPrimaryKey(goodsId);
        PicExample picExample = new PicExample();
        PicExample.Criteria picExampleCriteria = picExample.createCriteria();
        picExampleCriteria.andGoodsIdEqualTo(goodsId);
        goods.setPicList(picService.selectByExample(picExample));
        GoodsDetailExample goodsDetailExample = new GoodsDetailExample();
        GoodsDetailExample.Criteria goodsDetailExampleCriteria = goodsDetailExample.createCriteria();
        goodsDetailExampleCriteria.andGoodsIdEqualTo(goodsId);
        List<GoodsDetail> goodsDetailList = goodsDetailService.selectByExample(goodsDetailExample);
        Map<Integer,Integer> map = new HashMap<>();
        for (GoodsDetail goodsDetail : goodsDetailList) {
            map.put(goodsDetail.getTypeId(),goodsDetail.getGoodsId());
        }
        Set<Integer> keySet = map.keySet();
        List<GoodsDetailType> goodsDetailTypeList = new ArrayList<>();
        for (Integer typeId : keySet) {
            GoodsDetailTypeExample goodsDetailTypeExample = new GoodsDetailTypeExample();
            GoodsDetailTypeExample.Criteria goodsDetailTypeExampleCriteria = goodsDetailTypeExample.createCriteria();
            goodsDetailTypeExampleCriteria.andTypeIdEqualTo(typeId);
            GoodsDetailType goodsDetailType = goodsDetailTypeService.selectByPrimaryKey(typeId);
            goodsDetailExample.clear();
            goodsDetailExampleCriteria = goodsDetailExample.createCriteria();
            goodsDetailExampleCriteria.andGoodsIdEqualTo(goodsId);
            goodsDetailExampleCriteria.andTypeIdEqualTo(typeId);
            List<GoodsDetail> goodsDetails = goodsDetailService.selectByExample(goodsDetailExample);
            goodsDetailType.setGoodsDetailList(goodsDetails);
            goodsDetailTypeList.add(goodsDetailType);
        }
        goods.setGoodsDetailType(goodsDetailTypeList);
        Category category = categoryService.selectByPrimaryKey(goods.getCateId());

        request.setAttribute("category", category);
        request.setAttribute("goods", goods);
        return "/goods/goodsDetail";
    }
 
}
