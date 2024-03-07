package com.someecho.sojava.design.pattern01.factory;

/**
 * Created by mlh on 2017/12/24.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}