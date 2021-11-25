package com.headfirst.design.factory;

import com.headfirst.design.factory.domain.Pizza;
import com.headfirst.design.factory.enums.PizzaTaste;
import com.headfirst.design.factory.enums.PizzaType;

/**
 * @author LiuCan
 * @date 2021/3/30 19:46
 * @description NYPizzaStore
 */
public class NYPizzaStore  extends PizzaStore{
    @Override
    protected Pizza creatPizza(PizzaTaste pizzaTaste , PizzaType pizzaType) throws Exception {
        switch (pizzaType) {
            case NY_PIZZA:
                switch (pizzaTaste) {
                    case CLAM:
                        return new NYStyleClamPizza(pizzaTaste.getCode());
                    case CHEESE:
                        return new NYStyleCheesePizza(pizzaTaste.getCode());
                    case VEGGIE:
                        return new NYStyleVeggiePizza(pizzaTaste.getCode());
                    case PEPPERONI:
                        return new NYStylePepperoniPizza(pizzaTaste.getCode());
                    default:
                        throw new Exception("unknown pizza taste !");
                }
            default:
                throw new Exception("unknown pizza type!");
        }

    }
}
