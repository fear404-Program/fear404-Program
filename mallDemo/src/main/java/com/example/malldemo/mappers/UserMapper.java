package com.example.malldemo.mappers;

import com.example.malldemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author laicanw
 * @Date 2023/3/23 15:10
 */
@Mapper
public interface UserMapper {
    public User selectUserByName(String userName);
}
