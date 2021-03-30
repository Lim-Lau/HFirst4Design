package com.headfirst.design.factory;

import com.headfirst.design.factory.domain.Pizza;
import com.headfirst.design.factory.enums.PizzaTaste;

/**
 * @author LiuCan
 * @date 2021/3/30 19:40
 * @description PizzaStore
 */
public abstract class PizzaStore {
    public Pizza orderPizza(PizzaTaste type) {

        Pizza pizza;
        pizza = creatPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza creatPizza(PizzaTaste type) throws Exception;
}
