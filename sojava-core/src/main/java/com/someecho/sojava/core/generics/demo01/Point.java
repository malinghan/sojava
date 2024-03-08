package com.someecho.sojava.core.generics.demo01;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
class Point<T> {         // 此处可以随便写标识符号，T是type的简称
    private T var;     // var的类型由T指定，即：由外部指定

    public T getVar() {  // 返回值的类型由外部决定
        return var;
    }

    public void setVar(T var) {  // 设置的类型也由外部决定
        this.var = var;
    }
}
