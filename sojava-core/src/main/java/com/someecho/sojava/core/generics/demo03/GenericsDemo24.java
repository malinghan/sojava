package com.someecho.sojava.core.generics.demo03;

/**
 * 泛型接口
 */
public class GenericsDemo24 {
    public static void main(String arsg[]){  
        Info<String> i = null;        // 声明接口对象  
        i = new InfoImpl<String>("汤姆") ;  // 通过子类实例化对象  
        System.out.println("内容：" + i.getVar()) ;  
    }  
}