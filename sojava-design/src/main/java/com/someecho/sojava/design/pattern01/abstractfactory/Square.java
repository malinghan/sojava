package com.someecho.sojava.design.pattern01.abstractfactory;

/**
 * Created by mlh on 2017/12/24.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
