package com.someecho.sojava.thread.multithread.synchronize.test1;

/**
 * Created by mlh on 2017/12/22.
 */

/**
 * 测试方法内本地变量线程安全
 */
public class Run_local {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef=new HasSelfPrivateNum();
        ThreadA t1=new ThreadA(numRef);
        ThreadB t2=new ThreadB(numRef);
        t1.start();
        t2.start();
    }
}
