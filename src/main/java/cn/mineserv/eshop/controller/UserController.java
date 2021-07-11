package cn.mineserv.eshop.controller;


import cn.mineserv.eshop.service.CategoryService;
import cn.mineserv.eshop.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Y_YuanZhouLv
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private GoodsService goodsService;
    @Resource
    private CategoryService categoryService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet(HttpServletRequest request, HttpServletResponse response) {
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void loginPost(HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public void logoutGet(HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public void logoutPost(HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String registerGet(HttpServletRequest request, HttpServletResponse response) {
        return "";
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void registerPost(HttpServletRequest request, HttpServletResponse response) {
    }
}
