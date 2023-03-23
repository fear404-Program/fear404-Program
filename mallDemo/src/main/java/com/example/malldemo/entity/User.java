package com.example.malldemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author laicanw
 * @Date 2023/3/23 15:03
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String userName;
    private String userPSW;
}
