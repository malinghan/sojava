package com.someecho.sojava.core.string;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "he";
        String str2 = "llo";
        String str3 = "world";
        String str4 = str1 + str2 + str3;
        System.out.println(str4);
    }
}
//openjdk version "21.0.2" 2024-01-16 LTS
//public class com.someecho.sojava.core.string.StringDemo {
//public com.someecho.sojava.core.string.StringDemo();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//public static void main(java.lang.String[]);
//        Code:
//        0: ldc           #7                  // String he
//        2: astore_1
//        3: ldc           #9                  // String llo
//        5: astore_2
//        6: ldc           #11                 // String world
//        8: astore_3
//        9: aload_1
//        10: aload_2
//        11: aload_3
//        12: invokedynamic #13,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
//        17: astore        4
//        19: getstatic     #17                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        22: aload         4
//        24: invokevirtual #23                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        27: return
//        }

