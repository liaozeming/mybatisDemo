package com.lzm.mybatisdemo.pojo;

import lombok.Data;

/**
 * @description:
 * @author: lzm
 * @create: 2023-05-17 11:13
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
