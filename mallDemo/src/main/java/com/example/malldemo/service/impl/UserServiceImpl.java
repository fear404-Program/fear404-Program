package com.example.malldemo.service.impl;

import com.example.malldemo.entity.User;
import com.example.malldemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author laicanw
 * @Date 2023/3/23 15:04
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public Map<String,String> selectUserByName(String userName) {
        return null;
    }
}
