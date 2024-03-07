package com.someecho.sojava.design.pattern01.builder;

/**
 * Created by mlh on 2017/12/24.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
