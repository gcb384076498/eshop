package cn.mineserv.eshop.controller;


import cn.mineserv.eshop.model.Cart;
import cn.mineserv.eshop.model.User;
import cn.mineserv.eshop.service.CategoryService;
import cn.mineserv.eshop.service.GoodsService;
import cn.mineserv.eshop.service.UserService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Y_YuanZhouLv
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @Resource
    private CategoryService categoryService;

    @Resource
    private GoodsService goodsService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void loginPost(Model map, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        AllController.setEncodingJson(request, response);
        PrintWriter writer = AllController.getWriter(response);
        Map<String, Object> json = new HashMap<>();
        Gson gson = new Gson();
        User checkLogin = AllController.setLoginUserToSession(request, session, userService);
        if(checkLogin != null){
            map.addAttribute("user", checkLogin);
            session.setAttribute("isLogin",true);
            session.setAttribute("username", checkLogin.getUserName());
            json.put("state",true);
            json.put("username", checkLogin.getUserName());
        } else {
            session.setAttribute("isLogin",false);
            json.put("state",false);
        }
        writer.print(gson.toJson(json));
    }




    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public void logoutPost(Model map, HttpServletRequest request, HttpServletResponse response,HttpSession session) {
        AllController.setEncodingJson(request,response);
        PrintWriter writer = AllController.getWriter(response);
        session.setAttribute("isLogin",false);
        session.setAttribute("username","");
        session.removeAttribute("user");
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("state",true);
        Gson json = new Gson();
        writer.print(json.toJson(objectMap));
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void registerPost(Model map, HttpServletRequest request, HttpServletResponse response,HttpSession session) {
        AllController.setEncodingJson(request, response);
        PrintWriter writer;
        writer = AllController.getWriter(response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String email = request.getParameter("email");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        Map<String, Object> json = new HashMap<>();
        Gson gson = new Gson();
        if(password.equals(repassword)){
            boolean checkUsername = AllController.checkUsername(userService,username);
            if(!checkUsername){
                session.setAttribute("isLogin",false);
                json.put("state",false);
            } else {
                User user = new User();
                user.setUserAge(Integer.parseInt(age));
                user.setUserEmail(email);
                user.setUserName(username);
                user.setUserPass(password);
                user.setUserSex(Integer.parseInt(sex));
                user.setUserRank(0);
                int insert = userService.insertSelective(user);
                if(insert == 1){
                    List<Cart> cartLists = AllController.getCartListFromSession(session);
                    user.setCartList(cartLists);
                    session.setAttribute("user",user);
                    session.setAttribute("isLogin",true);
                    session.setAttribute("username",user.getUserName());
                    json.put("state",true);
                    json.put("username",user.getUserName());
                }else {
                    session.setAttribute("isLogin",false);
                    json.put("state",false);
                }

            }
        } else {
            session.setAttribute("isLogin",false);
            json.put("state",false);
        }
        writer.print(gson.toJson(json));
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model map, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        AllController.setEncodingJson(request, response);
        PrintWriter writer = AllController.getWriter(response);
        AllController.getAllCategoryList(map,categoryService,goodsService);

        return "/user/index";
    }


}
