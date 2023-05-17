package com.lzm.mybatisdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzm.mybatisdemo.pojo.CarInfo;
import com.lzm.mybatisdemo.service.CarInfoService;
import com.lzm.mybatisdemo.mapper.CarInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author lzm
* @description 针对表【car_info】的数据库操作Service实现
* @createDate 2023-05-17 14:52:12
*/
@Service
public class CarInfoServiceImpl extends ServiceImpl<CarInfoMapper, CarInfo> implements CarInfoService{

}




