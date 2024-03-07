package com.someecho.sojava.design.pattern01.builder;

/**
 * Created by mlh on 2017/12/24.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }
    @Override
    public String name() {
        return "Pepsi";
    }
}