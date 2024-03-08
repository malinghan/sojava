package com.someecho.sojava.core.object;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * javac
 * javap -c
 */
public class ObjectDemo {
    public static void main(String[] args) {
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        System.out.println(aa == bb);// true
        System.out.println(a == b);// false
        System.out.println(a.equals(b));// true
        System.out.println(42 == 42.0);// true

    }
}
