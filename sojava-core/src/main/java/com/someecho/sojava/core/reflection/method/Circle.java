package com.someecho.sojava.core.reflection.method;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
class Circle extends Shape {

    private void drawCircle() {
        System.out.println("drawCircle");
    }

    public int getAllCount() {
        return 100;
    }
}
