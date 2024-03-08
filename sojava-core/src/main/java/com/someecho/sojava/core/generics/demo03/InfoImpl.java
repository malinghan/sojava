package com.someecho.sojava.core.generics.demo03;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
class InfoImpl<T> implements Info<T> {   // 定义泛型接口的子类
    private T var;             // 定义属性

    public InfoImpl(T var) {     // 通过构造方法设置属性内容
        this.setVar(var);
    }

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return this.var;
    }
}
