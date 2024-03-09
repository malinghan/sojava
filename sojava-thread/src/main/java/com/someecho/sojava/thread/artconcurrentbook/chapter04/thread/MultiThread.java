package com.someecho.sojava.thread.artconcurrentbook.chapter04.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 6-1
 */
public class MultiThread {

    public static void main(String[] args) {
        //获取javabean管理MXBbean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息￼
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息￼
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }
    }
}
//[1] main    // main线程，用户程序入口
//[2] Reference Handler // 清除Reference的线程￼
//[3] Finalizer // 调用对象finalize方法的线程￼
//[4] Signal Dispatcher // 分发处理发送给JVM信号的线程
//[12] Common-Cleaner
//[13] Monitor Ctrl-Break
//[14] Notification Thread

//可以看到，一个Java程序的运行不仅仅是main()方法的运行，而是main线程和多个其他线程的同时运行。