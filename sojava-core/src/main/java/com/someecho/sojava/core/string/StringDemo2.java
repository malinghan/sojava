package com.someecho.sojava.core.string;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String[] arr = {"he", "llo", "world"};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
//    Compiled from "StringDemo2.java"
//public class com.someecho.sojava.core.string.StringDemo2 {
//public com.someecho.sojava.core.string.StringDemo2();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//public static void main(java.lang.String[]);
//        Code:
//        0: iconst_3
//        1: anewarray     #7                  // class java/lang/String
//        4: dup
//        5: iconst_0
//        6: ldc           #9                  // String he
//        8: aastore
//        9: dup
//        10: iconst_1
//        11: ldc           #11                 // String llo
//        13: aastore
//        14: dup
//        15: iconst_2
//        16: ldc           #13                 // String world
//        18: aastore
//        19: astore_1
//        20: ldc           #15                 // String
//        22: astore_2
//        23: iconst_0
//        24: istore_3
//        25: iload_3
//        26: aload_1
//        27: arraylength
//        28: if_icmpge     47
//        31: aload_2
//        32: aload_1
//        33: iload_3
//        34: aaload
//        35: invokedynamic #17,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
//        40: astore_2
//        41: iinc          3, 1
//        44: goto          25
//        47: getstatic     #21                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        50: aload_2
//        51: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        54: return
//        }
