package com.someecho.sojava.design.pattern01.bridge;

/**
 * Created by mlh on 2017/12/24.
 */
public class GreenCircle implements  DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
