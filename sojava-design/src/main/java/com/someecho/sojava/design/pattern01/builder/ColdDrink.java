package com.someecho.sojava.design.pattern01.builder;

/**
 * Created by mlh on 2017/12/24.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

//    @Override
    public abstract float price();
}