package com.headfirst.design.factory.enums;

/**
 * @author LiuCan
 * @date 2021/3/30 19:48
 * @description PizzaTaste
 */
public enum PizzaTaste {
    CHEESE( "CHEESE", "cheese"),
    VEGGIE("VEGGIE", "veggie"),
    CLAM("CLAM", "clam"),
    PEPPERONI("PEPPERONI", "pepperoni"),

    ;


    private String name;

    private String code;

    PizzaTaste( String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
