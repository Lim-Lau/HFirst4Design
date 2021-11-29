package com.headfirst.design.sawgger.model;

import lombok.Data;

/**
 * @author LiuCan
 * @date 2021/11/29 9:42
 */
@Data
public class Response {

    /**
     * 返回参数
     */
    private String description;

    /**
     * 参数名
     */
    private String name;

    /**
     * 备注
     */
    private String remark;
}
