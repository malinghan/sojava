package com.someecho.sojava.core.string;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * final 强制优化
 * 被 final 关键字修饰之后的 String 会被编译器当做常量来处理，编译器在程序编译期就可以确定它的值，其效果就相当于访问常量。
 * 如果 ，编译器在运行时才能知道其确切值的话，就无法对其优化。
 */
public class StringDemo5 {
    public static void main(String[] args) {
        final String str1 = "str";
        final String str2 = "ing";
        // 下面两个表达式其实是等价的
        String c = "str" + "ing";// 常量池中的对象
        String d = str1 + str2; // 常量池中的对象
        System.out.println(c == d);// true
    }
}
