package com.example.malldemo.controller;

import com.example.malldemo.entity.User;
import com.example.malldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author laicanw
 * @Date 2023/3/23 15:18
 */
@RestController("/user")
public class UserController {
    @Autowired
    UserService userService;

    ModelAndView modelAndView = new ModelAndView();

    @PostMapping("/login")
    public ModelAndView login(@RequestParam User user){
        Map<String, String> map = userService.selectUserByName(user.getUserName());
        modelAndView.addObject(map);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
