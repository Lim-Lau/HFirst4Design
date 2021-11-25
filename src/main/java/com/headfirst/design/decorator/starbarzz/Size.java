package com.headfirst.design.decorator.starbarzz;

/**
 * @author LiuCan
 * @date 2021/1/24 8:07
 * @description Size
 */
public enum Size {
    /*
    小杯
     */
    TALL("tall", "tall "),
    /*
    中杯
     */
    GRANDE("grande", "grande "),
    /*
    大杯
     */
    VENTI("venti", "venti "),
    /*
    普杯
     */
    NORMAL("normal", "normal "),
    ;

    private String code;

    private String name;

    Size(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }


    public String getName() {
        return name;
    }

}
