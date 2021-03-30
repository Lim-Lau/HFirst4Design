package com.headfirst.design.factory.enums;

/**
 * @author LiuCan
 * @date 2021/3/30 19:48
 * @description PizzaTaste
 */
public enum PizzaTaste {
    CHEESE(PizzaType.NY_PIZZA, "CHEESE", "cheese"),
    VEGGIE(PizzaType.NY_PIZZA, "VEGGIE", "veggie"),
    CLAM(PizzaType.NY_PIZZA, "CLAM", "clam"),
    PEPPERONI(PizzaType.NY_PIZZA, "PEPPERONI", "pepperoni"),
    ;

    private PizzaType pizzaType;

    private String name;

    private String code;

    PizzaTaste(PizzaType pizzaType, String name, String code) {
        this.pizzaType = pizzaType;
        this.name = name;
        this.code = code;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
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
