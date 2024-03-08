package com.someecho.sojava.core.exception;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class ExceptionDemo01 {
    public static void simpleTryCatch() {
        try {
            testNPE();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void testNPE() {
     }
}
//
//public class com.someecho.sojava.core.exception.ExceptionDemo01 {
//public com.someecho.sojava.core.exception.ExceptionDemo01();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//public static void simpleTryCatch();
//        Code:
//        0: invokestatic  #7                  // Method testNPE:()V
//        3: goto          11
//        6: astore_0
//        7: aload_0
//        8: invokevirtual #14                 // Method java/lang/Exception.printStackTrace:()V
//        11: return
//        Exception table:
//        from    to  target type
//        0     3     6   Class java/lang/Exception
//
//static void testNPE();
//        Code:
//        0: return
//        }
