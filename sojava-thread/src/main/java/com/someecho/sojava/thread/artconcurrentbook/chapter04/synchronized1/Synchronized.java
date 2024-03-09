package com.someecho.sojava.thread.artconcurrentbook.chapter04.synchronized1;

/**
 * 6-10
 * javac
 * javap -v
 * //        3: astore_1
 * //        4: monitorenter 获取锁
 * //        5: aload_1
 * //        6: monitorexit  释放锁
 * //        7: goto          15
 * //        10: astore_2
 * //        11: aload_1
 * //        12: monitorexit 释放锁
 * //        13: aload_2
 * //        14: athrow
 * //        15: invokestatic  #9                  // Method m:()V
 */
public class Synchronized {
    public static void main(String[] args) {
        synchronized (Synchronized.class) {

        }
        m();
    }

    public static synchronized void m() {
    }
}
//
//    Last modified 2024年3月10日; size 530 bytes
//        SHA-256 checksum 83413b121f1d3e983fc7518a3bb31525253c2c9f90fdb8e495ca88c6c1ddc0ec
//        Compiled from "Synchronized.java"
//public class com.someecho.sojava.thread.artconcurrentbook.chapter04.synchronized1.Synchronized
//        minor version: 0
//        major version: 65
//        flags: (0x0021) ACC_PUBLIC, ACC_SUPER
//        this_class: #7                          // com/someecho/sojava/thread/artconcurrentbook/chapter04/synchronized1/Synchronized
//        super_class: #2                         // java/lang/Object
//        interfaces: 0, fields: 0, methods: 3, attributes: 1
//        Constant pool:
//        #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
//        #2 = Class              #4             // java/lang/Object
//        #3 = NameAndType        #5:#6          // "<init>":()V
//        #4 = Utf8               java/lang/Object
//        #5 = Utf8               <init>
//   #6 = Utf8               ()V
//           #7 = Class              #8             // com/someecho/sojava/thread/artconcurrentbook/chapter04/synchronized1/Synchronized
//           #8 = Utf8               com/someecho/sojava/thread/artconcurrentbook/chapter04/synchronized1/Synchronized
//           #9 = Methodref          #7.#10         // com/someecho/sojava/thread/artconcurrentbook/chapter04/synchronized1/Synchronized.m:()V
//           #10 = NameAndType        #11:#6         // m:()V
//           #11 = Utf8               m
//           #12 = Utf8               Code
//           #13 = Utf8               LineNumberTable
//           #14 = Utf8               main
//           #15 = Utf8               ([Ljava/lang/String;)V
//           #16 = Utf8               StackMapTable
//           #17 = Class              #18            // "[Ljava/lang/String;"
//           #18 = Utf8               [Ljava/lang/String;
//           #19 = Class              #20            // java/lang/Throwable
//           #20 = Utf8               java/lang/Throwable
//           #21 = Utf8               SourceFile
//           #22 = Utf8               Synchronized.java
//           {
//public com.someecho.sojava.thread.artconcurrentbook.chapter04.synchronized1.Synchronized();
//        descriptor: ()V
//        flags: (0x0001) ACC_PUBLIC
//        Code:
//        stack=1, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//        LineNumberTable:
//        line 7: 0
//
//public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: (0x0009) ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=2, locals=3, args_size=1
//        0: ldc           #7                  // class com/someecho/sojava/thread/artconcurrentbook/chapter04/synchronized1/Synchronized
//        2: dup
//        3: astore_1
//        4: monitorenter
//        5: aload_1
//        6: monitorexit
//        7: goto          15
//        10: astore_2
//        11: aload_1
//        12: monitorexit
//        13: aload_2
//        14: athrow
//        15: invokestatic  #9                  // Method m:()V
//        18: return
//        Exception table:
//        from    to  target type
//        5     7    10   any
//        10    13    10   any
//        LineNumberTable:
//        line 9: 0
//        line 11: 5
//        line 12: 15
//        line 13: 18
//        StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//        offset_delta = 10
//        locals = [ class "[Ljava/lang/String;", class java/lang/Object ]
//        stack = [ class java/lang/Throwable ]
//        frame_type = 250 /* chop */
//        offset_delta = 4
//
//public static synchronized void m();
//        descriptor: ()V
//        flags: (0x0029) ACC_PUBLIC, ACC_STATIC, ACC_SYNCHRONIZED
//        Code:
//        stack=0, locals=0, args_size=0
//        0: return
//        LineNumberTable:
//        line 16: 0
//        }
//        SourceFile: "Synchronized.java"
