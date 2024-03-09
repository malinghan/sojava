package com.someecho.sojava.thread.artconcurrentbook.chapter03.final1;

public class FinalReferenceEscapeExample {

    final int i;
    static FinalReferenceEscapeExample obj;

    public FinalReferenceEscapeExample() {
        i = 1; //1 基本类型
        obj = this; //2 对象引用
    }

    public static void writer() {
        new FinalReferenceEscapeExample();
    }

    public static void reader() {
        if (obj != null) { //3
            int temp = obj.i; //4
        }
    }
}