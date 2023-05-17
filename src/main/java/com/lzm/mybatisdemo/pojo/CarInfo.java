package com.lzm.mybatisdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName car_info
 */
@TableName(value ="car_info")
@Data
public class CarInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String userid;

    /**
     * 
     */
    private String plate;

    /**
     * 
     */
    private String img;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String model;

    /**
     * 
     */
    private String color;

    /**
     * 
     */
    private String price;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}