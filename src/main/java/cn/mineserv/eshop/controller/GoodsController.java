package cn.mineserv.eshop.controller;

import cn.mineserv.eshop.example.*;
import cn.mineserv.eshop.model.*;
import cn.mineserv.eshop.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.*;

/**
 * @author Y_YuanZhouLv
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
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

    @RequestMapping("/saleGoods")
    public String saleGoods(Model map, HttpServletRequest request, HttpServletResponse response) {
        AllController.setServletLink(request,"saleGoods");
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.setOrderByClause("goods_sales desc");
        GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
        goodsExampleCriteria.andGoodsSalesNotEqualTo(0);
        List<Goods> salesGoods = goodsService.selectByExample(goodsExample);
        AllController.getAllCategoryList(map,categoryService,goodsService);
        map.addAttribute("salesGoods", salesGoods);
        return "/goods/saleGoods";
    }

    @RequestMapping("/cateGoods")
    public String cateGoods(Model map, HttpServletRequest request, HttpServletResponse response) {
        return cateGoods(map, request, response, 0, 0);
    }
    @RequestMapping("/cateGoods/{sortId}")
    public String cateGoods(Model map, HttpServletRequest request, HttpServletResponse response, @PathVariable("sortId") Integer sortId) {
        return cateGoods(map, request, response, sortId, 0);
    }

    @RequestMapping("/cateGoods/{sortId}/{childId}")
    public String cateGoods(Model map, HttpServletRequest request, HttpServletResponse response, @PathVariable("sortId") Integer sortId, @PathVariable("childId") Integer childId) {
        AllController.setServletLink(request,"cateGoods");
        GoodsExample goodsExample = new GoodsExample();
        if(sortId == 0){
            goodsExample.setOrderByClause("goods_date desc");
        } else if(sortId == 1){
            goodsExample.setOrderByClause("goods_price asc");
        } else if(sortId == 2){
            goodsExample.setOrderByClause("goods_price desc");
        } else if(sortId == 3){
            goodsExample.setOrderByClause("goods_sales desc");
        } else if(sortId == 4){
            goodsExample.setOrderByClause("goods_sales asc");
        }
        GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
        if(childId!=0){
            goodsExampleCriteria.andCateIdEqualTo(childId);
        }
        List<Goods> goodsList = goodsService.selectByExample(goodsExample);
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria categoryExampleCriteria = categoryExample.createCriteria();
        categoryExampleCriteria.andParentidIsNull();
        List<Category> categoryList = categoryService.selectByExample(categoryExample);
        List<Category> categories = new ArrayList<>();
        for (Category category : categoryList) {
            categoryExample.clear();
            categoryExampleCriteria = categoryExample.createCriteria();
            categoryExampleCriteria.andParentidEqualTo(category.getCateId());
            List<Category> childCategory = categoryService.selectByExample(categoryExample);
            categories.addAll(childCategory);
            category.setChildCategory(childCategory);
        }
        map.addAttribute("categories", categories);
        AllController.getAllCategoryList(map, categoryService, goodsService);
        map.addAttribute("childId", childId);
        map.addAttribute("sortId", sortId);
        map.addAttribute("goodsList", goodsList);

        return "/goods/cateGoods";
    }


    @RequestMapping("/goodsDetail/{goodsId}")
    public String goodsDetail(Model map, HttpServletRequest request, HttpServletResponse response, @PathVariable("goodsId") Integer goodsId) {
        AllController.setServletLink(request,"goodsDetail");
        Goods goods = goodsService.selectByPrimaryKey(goodsId);
        PicExample picExample = new PicExample();
        PicExample.Criteria picExampleCriteria = picExample.createCriteria();
        picExampleCriteria.andGoodsIdEqualTo(goodsId);
        goods.setPicList(picService.selectByExample(picExample));
        GoodsDetailExample goodsDetailExample = new GoodsDetailExample();
        GoodsDetailExample.Criteria goodsDetailExampleCriteria = goodsDetailExample.createCriteria();
        goodsDetailExampleCriteria.andGoodsIdEqualTo(goodsId);
        List<GoodsDetail> goodsDetailList = goodsDetailService.selectByExample(goodsDetailExample);
        Map<Integer,Integer> maps = new HashMap<>();
        for (GoodsDetail goodsDetail : goodsDetailList) {
            maps.put(goodsDetail.getTypeId(),goodsDetail.getGoodsId());
        }
        Set<Integer> keySet = maps.keySet();
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
        AllController.getAllCategoryList(map, categoryService, goodsService);
        map.addAttribute("category", category);
        map.addAttribute("goods", goods);
        return "/goods/goodsDetail";
    }



    @RequestMapping("/newestGoods")
    public String newestGoods(Model map, HttpServletRequest request, HttpServletResponse response) {
        AllController.setServletLink(request,"newestGoods");
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.setOrderByClause("goods_date desc limit 9");
        List<Goods> newGoods = goodsService.selectByExample(goodsExample);
        map.addAttribute("newGoods", newGoods);
        AllController.getAllCategoryList(map, categoryService, goodsService);
        return "/goods/newestGoods";
    }

    @RequestMapping("/searchGoods")
    public String searchGoods(Model map, HttpServletRequest request, HttpServletResponse response) {
        return cateGoods(map, request, response, 0, 0);
    }
    @RequestMapping("/searchGoods/")
    public String searchGoodsJump(Model map, HttpServletRequest request, HttpServletResponse response) {
        return cateGoods(map, request, response, 0, 0);
    }

    @RequestMapping("/searchGoods/{searchName}")
    public String searchGoods(Model map, HttpServletRequest request, HttpServletResponse response, @PathVariable("searchName") String searchName) {
        return searchGoods(map, request, response, searchName,0,  0);
    }

    @RequestMapping("/searchGoods/{searchName}/{sortId}")
    public String searchGoods(Model map, HttpServletRequest request, HttpServletResponse response, @PathVariable("searchName") String searchName, @PathVariable("sortId") Integer sortId) {
        return searchGoods(map, request, response, searchName,sortId,  0);
    }

    @RequestMapping("/searchGoods/{searchName}/{sortId}/{childId}")
    public String searchGoods(Model map, HttpServletRequest request, HttpServletResponse response, @PathVariable("searchName") String searchName, @PathVariable("sortId") Integer sortId, @PathVariable("childId") Integer childId) {
        AllController.setServletLink(request,"searchGoods");
        System.out.println("searchName = " + searchName);
        try {
            searchName = URLDecoder.decode(searchName,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("URLDecoder.decode(searchName) = " + searchName);
        GoodsExample goodsExample = new GoodsExample();
        if(sortId == 0){
            goodsExample.setOrderByClause("goods_date desc");
        } else if(sortId == 1){
            goodsExample.setOrderByClause("goods_price asc");
        } else if(sortId == 2){
            goodsExample.setOrderByClause("goods_price desc");
        } else if(sortId == 3){
            goodsExample.setOrderByClause("goods_sales desc");
        } else if(sortId == 4){
            goodsExample.setOrderByClause("goods_sales asc");
        }
        GoodsExample.Criteria goodsExampleCriteria = goodsExample.createCriteria();
        String[] strings = searchName.trim().split(" ");
        for (String s : strings) {
            goodsExampleCriteria.andGoodsNameLike("%" + s + "%");
        }
        if(childId!=0){
            goodsExampleCriteria.andCateIdEqualTo(childId);
        }
        List<Goods> goodsList = goodsService.selectByExample(goodsExample);
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria categoryExampleCriteria = categoryExample.createCriteria();
        categoryExampleCriteria.andParentidIsNull();
        List<Category> categoryList = categoryService.selectByExample(categoryExample);
        List<Category> categories = new ArrayList<>();
        for (Category category : categoryList) {
            categoryExample.clear();
            categoryExampleCriteria = categoryExample.createCriteria();
            categoryExampleCriteria.andParentidEqualTo(category.getCateId());
            List<Category> childCategory = categoryService.selectByExample(categoryExample);
            categories.addAll(childCategory);
            category.setChildCategory(childCategory);
        }
        map.addAttribute("categories", categories);
        AllController.getAllCategoryList(map, categoryService, goodsService);
        map.addAttribute("goodsList",goodsList);
        map.addAttribute("childId",childId);
        map.addAttribute("sortId",sortId);
        map.addAttribute("searchName",searchName);
        return "/goods/searchGoods";
    }

    @RequestMapping(value = "/addCart/", method = RequestMethod.POST)
    public void addCart(Model map, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        AllController.setServletLink(request,"addCart");
        List<Cart> cartList = AllController.getCartListFromSession(session);
        Cart cart = new Cart();
        cart.setGoods(goodsService.selectByPrimaryKey(Integer.parseInt(request.getParameter("goodsId"))));
        cart.setAddDate(new Date());
        List<GoodsDetail> goodsDetailList = new ArrayList<>();
        List<GoodsDetailType> goodsDetailTypeList = new ArrayList<>();
        GoodsDetailType goodsDetailType = goodsDetailTypeService.selectByPrimaryKey(0);
        cart.setGoodsDetailTypeList(goodsDetailTypeList);
        cart.setNumber(Integer.parseInt(request.getParameter("number")));
        response.setHeader("Refresh","0;url=javascript:history.go(-1);");
    }

}
