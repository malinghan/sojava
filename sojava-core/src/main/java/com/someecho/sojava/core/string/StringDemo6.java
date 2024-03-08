package com.someecho.sojava.core.string;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * 如果 ，编译器在运行时才能知道其确切值的话，就无法对其优化。
 */
public class StringDemo6 {
    public static void main(String[] args) {
        final String str1 = "str";
        final String str2 = getStr();
        String c = "str" + "ing";// 常量池中的对象
        String d = str1 + str2; // 在堆上创建的新的对象
        System.out.println(c == d);// false
    }

    public static String getStr() {
        return "ing";
    }
}
