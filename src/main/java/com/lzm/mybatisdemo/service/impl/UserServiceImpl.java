package com.lzm.mybatisdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzm.mybatisdemo.mapper.UserMapper;
import com.lzm.mybatisdemo.pojo.User;
import com.lzm.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description:
 * @author: lzm
 * @create: 2023-05-17 11:56
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    public void test() {
        Map<String, Object> stringObjectMap = userMapper.selectMapByID(1L);
        System.out.println(stringObjectMap);
    }
}
