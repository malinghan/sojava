package com.someecho.sojava.core.reflection.method;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
class Shape {
    public void draw() {
        System.out.println("draw");
    }

    public void draw(int count, String name) {
        System.out.println("draw " + name + ",count=" + count);
    }

}
