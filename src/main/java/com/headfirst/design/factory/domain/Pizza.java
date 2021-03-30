package com.headfirst.design.factory.domain;

/**
 * @author LiuCan
 * @date 2021/3/30 19:42
 * @description Pizza
 */
public  abstract  class Pizza {

    public abstract void bake();

    public abstract void prepare();

    public abstract void cut();

    public abstract void box();
}
