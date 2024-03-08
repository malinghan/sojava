package com.someecho.sojava.core.exception;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class ExceptionDemo02 {
    public static void simpleTryCatchFinally() {
        try {
            testNPE();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }

    static void testNPE() {
     }
}
//
//public class com.someecho.sojava.core.exception.ExceptionDemo02 {
//public com.someecho.sojava.core.exception.ExceptionDemo02();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//public static void simpleTryCatchFinally();
//        Code:
//        0: invokestatic  #7                  // Method testNPE:()V
//        3: getstatic     #12                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        6: ldc           #18                 // String Finally
//        8: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        11: goto          41
//        14: astore_0
//        15: aload_0
//        16: invokevirtual #28                 // Method java/lang/Exception.printStackTrace:()V
//        19: getstatic     #12                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        22: ldc           #18                 // String Finally
//        24: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        27: goto          41
//        30: astore_1
//        31: getstatic     #12                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        34: ldc           #18                 // String Finally
//        36: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        39: aload_1
//        40: athrow
//        41: return
//        Exception table:
//        from    to  target type
//        0     3    14   Class java/lang/Exception
//        0     3    30   any
//        14    19    30   any
//
//static void testNPE();
//        Code:
//        0: return
//        }
