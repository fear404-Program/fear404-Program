package com.example.malldemo.controller;

<<<<<<< HEAD
import com.alibaba.fastjson.JSONObject;
=======
>>>>>>> f43a413 (商场Demo首次上传)
import com.example.malldemo.entity.User;
import com.example.malldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> f43a413 (商场Demo首次上传)
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
<<<<<<< HEAD
    public ModelAndView login(@RequestBody JSONObject jsonObject){
        User user = JSONObject.toJavaObject(jsonObject,User.class);
//        Map<String, String> map = userService.selectUserByName(user.getUserName());
//        modelAndView.addObject(map);
//        modelAndView.setViewName("index");
=======
    public ModelAndView login(@RequestParam User user){
        Map<String, String> map = userService.selectUserByName(user.getUserName());
        modelAndView.addObject(map);
        modelAndView.setViewName("index");
>>>>>>> f43a413 (商场Demo首次上传)
        return modelAndView;
    }
}
