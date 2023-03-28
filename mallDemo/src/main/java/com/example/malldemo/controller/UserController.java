package com.example.malldemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.malldemo.entity.User;
import com.example.malldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author laicanw
 * @Date 2023/3/23 15:18
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    ModelAndView modelAndView = new ModelAndView();

    @PostMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request){
        System.out.println(user.getUserName()+":"+user.getUserPSW());
        Map<String, String> map = userService.login(user);
        if (map.get("code").equals("001")){
            request.getSession().setAttribute("user",user);
        }
        modelAndView.addObject(map);
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @PostMapping("/ajaxLogin")
    @ResponseBody
    public Map<String,String> ajaxLogin(String userName,String userPSW){
        User user = new User();
        System.out.println(userName+":"+userPSW);
        user.setUserName(userName);
        user.setUserPSW(userPSW);
        Map<String,String> resoutMap = userService.login(user);
        return resoutMap;
    }
    @RequestMapping("/cancellation")
    public String cancellation(HttpServletRequest request){
        request.getSession().invalidate();
        return "/login";
    }

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }
}
