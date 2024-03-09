package com.someecho.sojava.thread.artconcurrentbook.chapter04.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.someecho.sojava.thread.artconcurrentbook.chapter04.SleepUtils;

/**
 * 6-3 线程状态
 * jps
 * jstack pis
 */
public class ThreadState {

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TimeWaitingThread").start();
        new Thread(new Waiting(), "WaitingThread").start();
        // Blocked
        new Thread(new Blocked(), "BlockedThread-1").start();
        new Thread(new Blocked(), "BlockedThread-2").start();
        new Thread(new Sync(), "SyncThread-1").start();
        new Thread(new Sync(), "SyncThread-2").start();
    }

    /**
     * waiting
     */
    static class TimeWaiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                SleepUtils.second(100);
            }
        }
    }

    static class Waiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (Waiting.class) {
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable {
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    SleepUtils.second(100);
                }
            }
        }
    }

    static class Sync implements Runnable {

        @Override
        public void run() {
            lock.lock();
            try {
                SleepUtils.second(100);
            } finally {
                lock.unlock();
            }

        }

    }
}
//
//"TimeWaitingThread" #15 prio=5 os_prio=31 cpu=0.41ms elapsed=46.45s tid=0x000000012685bc00 nid=0x6d03 waiting on condition  [0x000000016ffaa000]
//        java.lang.Thread.State: TIMED_WAITING (sleeping)
//        at java.lang.Thread.sleep(java.base@17.0.10/Native Method)
//        at java.lang.Thread.sleep(java.base@17.0.10/Thread.java:344)
//        at java.util.concurrent.TimeUnit.sleep(java.base@17.0.10/TimeUnit.java:446)
//        at com.someecho.sojava.thread.artconcurrentbook.chapter04.SleepUtils.second(SleepUtils.java:11)
//        at com.someecho.sojava.thread.artconcurrentbook.chapter04.thread.ThreadState$TimeWaiting.run(ThreadState.java:34)
//        at java.lang.Thread.run(java.base@17.0.10/Thread.java:840)


//"BlockedThread-1" #17 prio=5 os_prio=31 cpu=0.07ms elapsed=46.45s tid=0x0000000158824a00 nid=0x6403 waiting on condition  [0x0000000288412000]
//        java.lang.Thread.State: TIMED_WAITING (sleeping)
//        at java.lang.Thread.sleep(java.base@17.0.10/Native Method)
//        at java.lang.Thread.sleep(java.base@17.0.10/Thread.java:344)
//        at java.util.concurrent.TimeUnit.sleep(java.base@17.0.10/TimeUnit.java:446)
//        at com.someecho.sojava.thread.artconcurrentbook.chapter04.SleepUtils.second(SleepUtils.java:11)
//        at com.someecho.sojava.thread.artconcurrentbook.chapter04.thread.ThreadState$Blocked.run(ThreadState.java:64)
//        - locked <0x000000070fa0d4a0> (a java.lang.Class for com.someecho.sojava.thread.artconcurrentbook.chapter04.thread.ThreadState$Blocked)
//        at java.lang.Thread.run(java.base@17.0.10/Thread.java:840)

