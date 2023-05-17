package com.lzm.mybatisdemo.mapper;
import org.apache.ibatis.annotations.Param;

import com.lzm.mybatisdemo.pojo.CarInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author lzm
* @description 针对表【car_info】的数据库操作Mapper
* @createDate 2023-05-17 14:52:12
* @Entity com.lzm.mybatisDemo.pojo.CarInfo
*/
public interface CarInfoMapper extends BaseMapper<CarInfo> {
    int insertSelective(CarInfo carInfo);
}




