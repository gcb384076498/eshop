package cn.mineserv.eshop.controller;

import cn.mineserv.eshop.example.CategoryExample;
import cn.mineserv.eshop.example.GoodsExample;
import cn.mineserv.eshop.example.UserExample;
import cn.mineserv.eshop.model.Cart;
import cn.mineserv.eshop.model.Category;
import cn.mineserv.eshop.model.User;
import cn.mineserv.eshop.service.CategoryService;
import cn.mineserv.eshop.service.GoodsService;
import cn.mineserv.eshop.service.UserService;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 爱吃蛋白的丶圆周率
 * @company 圆周率有限公司
 */
public class AllController {
    public static void setServletLink(HttpServletRequest request, String servletLink) {
        request.setAttribute("link",servletLink);
    }


    public static PrintWriter getWriter(HttpServletResponse response) {
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer;
    }

    public static void setEncodingJson(HttpServletRequest request, HttpServletResponse response) {
        setEncoding(request, response);
        response.setContentType("text/json");
    }

    public static void setEncodingHtml(HttpServletRequest request, HttpServletResponse response) {
        setEncoding(request, response);
        response.setContentType("text/html");
    }

    public static void setEncoding(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void getAllCategoryList(Model map, CategoryService categoryService, GoodsService goodsService) {
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
        map.addAttribute("categoryList", categoryList);
    }
    public static void setCartListToSession(HttpSession session, List<Cart> cartList) {
        session.setAttribute("cartList",cartList);
    }
    public static List<Cart> getCartListFromSession(HttpSession session) {
        List<Cart> cartLists = new ArrayList<>();
        Object cartList = session.getAttribute("cartList");
        if(cartList != null){
            if(cartList instanceof List<?>){
                for (Object obj : (List<?>)cartList) {
                    cartLists.add((Cart)obj);
                }
            }
        }
        return cartLists;
    }
    public static boolean checkUsername(UserService userService, String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria = userExample.createCriteria();
        userExampleCriteria.andUserNameEqualTo(username);
        List<User> users = userService.selectByExample(userExample);
        return users == null || users.size() == 0;
    }

    public static User login(UserService userService,String userName,String passWord) {
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria = userExample.createCriteria();
        userExampleCriteria.andUserNameEqualTo(userName);
        userExampleCriteria.andUserPassEqualTo(passWord);
        List<User> users = userService.selectByExample(userExample);
        if(users != null && users.size() != 0){
            return users.get(0);
        } else {
            return null;
        }
    }
    public static User setLoginUserToSession(HttpServletRequest request, HttpSession session, UserService userService) {
        User user = AllController.login(userService, request.getParameter("username"), request.getParameter("password"));
        if(user != null){
            session.setAttribute("isLogin",true);
            session.setAttribute("username", user.getUserName());
        }
        return user;
    }
}
