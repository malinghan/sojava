package com.someecho.sojava.core.exception;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class ExceptionDemo03 {
    public static String tryCatchReturn() {
        try {
            testNPE();
            return  "OK";
        } catch (Exception e) {
            return "ERROR";
        } finally {
            System.out.println("tryCatchReturn");
        }
    }

    static void testNPE() {
     }
}
//
//public class com.someecho.sojava.core.exception.ExceptionDemo03 {
//public com.someecho.sojava.core.exception.ExceptionDemo03();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//public static java.lang.String tryCatchReturn();
//        Code:
//        0: invokestatic  #7                  // Method testNPE:()V
//        3: ldc           #12                 // String OK
//        5: astore_0
//        6: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        9: ldc           #20                 // String tryCatchReturn
//        11: invokevirtual #22                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        14: aload_0
//        15: areturn
//        16: astore_0
//        17: ldc           #30                 // String ERROR
//        19: astore_1
//        20: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        23: ldc           #20                 // String tryCatchReturn
//        25: invokevirtual #22                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        28: aload_1
//        29: areturn
//        30: astore_2
//        31: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        34: ldc           #20                 // String tryCatchReturn
//        36: invokevirtual #22                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        39: aload_2
//        40: athrow
//        Exception table:
//        from    to  target type
//        0     6    16   Class java/lang/Exception
//        0     6    30   any
//        16    20    30   any
//
//static void testNPE();
//        Code:
//        0: return
//        }
