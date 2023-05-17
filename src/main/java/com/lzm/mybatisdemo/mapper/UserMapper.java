package com.lzm.mybatisdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lzm.mybatisdemo.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @description:
 * @author: lzm
 * @create: 2023-05-17 11:17
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据id查询用户信息
     *
     * @param id id
     * @return
     */
    @MapKey("id")
    Map<String, Object> selectMapByID(Long id);

    IPage<User> selectPageVo(@Param("page") Page<User> page, @Param("age") Integer age);
}
