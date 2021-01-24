package com.headfirst.design.decorator.starbuzz.condiment;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * @author LiuCan
 * @date 2021/1/24 7:59
 * @description CondimentPrettyPrint
 */
public abstract class CondimentPrettyPrint extends Beverage {

    public abstract String getDescription();

    /**
     * 将description 优雅打印
     *    “Dark Roast,Mocha,Mocha,Whip”
     *    ——> “Dark Roast,Double Mocha,Whip”
     * @author LiuCan
     * @date 2021/1/24 8:03
     * @param
     * @return java.lang.String
     */
    public abstract String prettyPrintDescription();

}
