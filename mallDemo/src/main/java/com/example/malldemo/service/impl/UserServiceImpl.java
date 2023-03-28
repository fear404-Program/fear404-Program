package com.example.malldemo.service.impl;

import com.example.malldemo.entity.User;
import com.example.malldemo.mappers.UserMapper;
import com.example.malldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author laicanw
 * @Date 2023/3/23 15:04
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Map<String,String> login(User user) {
        Map<String,String> resultMap = new HashMap<>();
        User queUser = userMapper.selectUserByName(user.getUserName());
        if (queUser.getUserPSW().equals(user.getUserPSW())){
            resultMap.put("code","001");
            resultMap.put("message","登陆成功");
        }else {
            resultMap.put("code","002");
            resultMap.put("message","登陆失败");
        }
        return resultMap;
    }
}
