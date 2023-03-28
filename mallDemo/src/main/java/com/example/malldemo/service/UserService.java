package com.example.malldemo.service;

import com.example.malldemo.entity.User;

import java.util.Map;

/**
 * @author laicanw
 * @Date 2023/3/23 15:04
 */
public interface UserService {
    public Map<String,String> login(User user);
}
