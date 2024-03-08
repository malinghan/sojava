package com.someecho.sojava.core.generics.demo05;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class Info<T> {
    private T var;        // 定义泛型变量

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return this.var;
    }

    public String toString() {    // 直接打印
        return this.var.toString();
    }
}
