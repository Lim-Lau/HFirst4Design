package com.headfirst.design.sawgger.model;

import lombok.Data;

/**
 * @author LiuCan
 * @date 2021/11/29 9:42
 */
@Data
public class Request {

    /**
     * 参数名
     */
    private String name;

    /**
     * 数据类型
     */
    private String type;

    /**
     * 参数类型
     */
    private String paramType;

    /**
     * 是否必填
     */
    private Boolean require;

    /**
     * 说明
     */
    private String remark;
}
