package com.someecho.sojava.core.reflection.classt;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * 普通类、内部类、数组类、匿名类的区别
 * class.forName()
 * 我们不能用getCanonicalName去加载类对象，必须用getName
 */
public class ClassTest3 {
    private  class inner{
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //普通类
        System.out.println("--------输出普通类信息-----------");
        System.out.println(ClassTest3.class.getSimpleName()); //Test
        System.out.println(ClassTest3.class.getName()); //com.cry.Test
        System.out.println(ClassTest3.class.getCanonicalName()); //com.cry.Test
        //内部类
        System.out.println("--------输出内部类信息-----------");
        System.out.println(inner.class.getSimpleName()); //inner
        System.out.println(inner.class.getName()); //com.cry.Test$inner
        System.out.println(inner.class.getCanonicalName()); //com.cry.Test.inner
        //数组
        System.out.println("--------输出数组类信息-----------");
        System.out.println(args.getClass().getSimpleName()); //String[]
        System.out.println(args.getClass().getName()); //[Ljava.lang.String;
        System.out.println(args.getClass().getCanonicalName()); //java.lang.String[]
        //我们不能用getCanonicalName去加载类对象，必须用getName
        Class.forName(inner.class.getCanonicalName()); //报错
        Class.forName(inner.class.getName());
    }
}
