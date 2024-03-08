package com.someecho.sojava.core.generics.demo04;

import java.util.List;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * 演示泛型上下界的引入原因
 */
public class GenericsDemo {
    class A{}
    class B extends A {}

    // 如下两个方法不会报错
    public static void funA(A a) {
        // ...
    }
    public static void funB(B b) {
        funA(b);
        // ...
    }

    // 如下funD方法会报错
    public static void funC(List<A> listA) {
        // ...
    }
    public static void funD(List<B> listB) {
        //funC(listB);
        // Unresolved compilation problem: The method doPrint(List<A>) in the type test is not applicable for the arguments (List<B>)
        // ...
    }
}
