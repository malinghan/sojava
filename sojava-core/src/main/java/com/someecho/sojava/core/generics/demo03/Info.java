package com.someecho.sojava.core.generics.demo03;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
interface Info<T> {        // 在接口上定义泛型
    public T getVar(); // 定义抽象方法，抽象方法的返回值就是泛型类型
}
