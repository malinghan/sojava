package com.someecho.sojava.core.string;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 *  常量折叠(Constant Folding)
 *  并不是所有的常量都会进行折叠，只有编译器在程序编译期就可以确定值的常量才可以
 *  ● 基本数据类型( byte、boolean、short、char、int、float、long、double)以及字符串常量。
 * ● final 修饰的基本数据类型和字符串变量
 * ● 字符串通过 “+”拼接得到的字符串、基本数据类型之间算数运算（加减乘除）、基本数据类型的位运算（<<、>>、>>> ）
 * 我们在平时写代码的时候，尽量避免多个字符串对象拼接，因为这样会重新创建对象。如果需要改变字符串的话，可以使用 StringBuilder 或者 StringBuffer。
 * 不过，字符串使用 final 关键字声明之后，可以让编译器当做常量来处理。
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";  //被优化成 String str3 = "string";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false
    }
}
