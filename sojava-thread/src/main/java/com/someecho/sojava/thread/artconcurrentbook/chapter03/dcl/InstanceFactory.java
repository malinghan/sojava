package com.someecho.sojava.thread.artconcurrentbook.chapter03.dcl;


/**
 * 初始化一个类，包括执行这个类的静态初始化和初始化在这个类中声明的静态字段。
 * 根据Java语言规范，在首次发生下列任意一种情况时，一个类或接口类型T将被立即初始化。
 * 1）T是一个类，而且一个T类型的实例被创建。
 * 2）T是一个类，且T中声明的一个静态方法被调用。
 * 3）T中声明的一个静态字段被赋值。
 * 4）T中声明的一个静态字段被使用，而且这个字段不是一个常量字段。
 * 5）T是一个顶级类（Top Level Class，见Java语言规范的§7.6），而且一个断言语句嵌套在T内部被执行
 */
public class InstanceFactory {
    private static class InstanceHolder {
        public static Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return InstanceHolder.instance; //单例化新建实例
    }

    static class Instance {
    }
}