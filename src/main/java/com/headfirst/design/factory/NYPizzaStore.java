package com.headfirst.design.factory;

import com.headfirst.design.factory.domain.Pizza;
import com.headfirst.design.factory.enums.PizzaTaste;

/**
 * @author LiuCan
 * @date 2021/3/30 19:46
 * @description NYPizzaStore
 */
public class NYPizzaStore  extends PizzaStore{
    @Override
    protected Pizza creatPizza(PizzaTaste type) throws Exception {
        switch (type) {
            case CLAM:
                return new NYStyleClamPizza(type.getCode());
            case CHEESE:
                return new NYStyleCheesePizza(type.getCode());
            case VEGGIE:
                return new NYStyleVeggiePizza(type.getCode());
            case PEPPERONI:
                return new NYStylePepperoniPizza(type.getCode());
            default:
                throw new Exception("unknown pizza type !");
        }
    }
}
