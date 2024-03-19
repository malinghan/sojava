package com.someecho.sojava.core.string;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-19
 */
public class StringSplitDemo {
    public static void main(String[] args) {
        String s  = "a  b  c d   ";
        String[] arr = s.split(" ");
        for (String s1 : arr) {
            System.out.println(s1.length() +"：" + s1);
        }
        //1：a
        //0：
        //1：b
        //0：
        //1：c
        //1：d
        //结论: 多个空格会拆分出空字符串
    }
}
