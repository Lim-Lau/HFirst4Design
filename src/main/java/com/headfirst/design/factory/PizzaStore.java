package com.headfirst.design.factory;

import com.headfirst.design.factory.domain.Pizza;
import com.headfirst.design.factory.enums.PizzaTaste;
import com.headfirst.design.factory.enums.PizzaType;

/**
 * @author LiuCan
 * @date 2021/3/30 19:40
 * @description PizzaStore
 */
public abstract class PizzaStore {
    public Pizza orderPizza(PizzaTaste pizzaTaste , PizzaType pizzaType) throws Exception {

        Pizza pizza;
        pizza = creatPizza(pizzaTaste , pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza creatPizza(PizzaTaste taste , PizzaType type) throws Exception;
}
