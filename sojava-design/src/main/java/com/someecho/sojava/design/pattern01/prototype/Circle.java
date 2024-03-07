package com.someecho.sojava.design.pattern01.prototype;

/**
 * Created by mlh on 2017/12/24.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}