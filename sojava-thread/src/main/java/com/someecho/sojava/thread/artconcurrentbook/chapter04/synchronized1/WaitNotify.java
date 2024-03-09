/**
 * 
 */
package com.someecho.sojava.thread.artconcurrentbook.chapter04.synchronized1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.someecho.sojava.thread.artconcurrentbook.chapter04.SleepUtils;

/**
 * 6-11
 * Thread[WaitThread,5,main] flag is true. wait @ 03:47:14
 * Thread[NotifyThread,5,main] hold lock. notify @ 03:47:15
 * Thread[NotifyThread,5,main] hold lock again. sleep @ 03:47:20
 * Thread[WaitThread,5,main] flag is false. running @ 03:47:25
 */
public class WaitNotify {
    static boolean flag = true;
    static Object  lock = new Object();

    public static void main(String[] args) throws Exception {
        Thread waitThread = new Thread(new Wait(), "WaitThread");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);

        Thread notifyThread = new Thread(new Notify(), "NotifyThread");
        notifyThread.start();
    }

    static class Wait implements Runnable {
        public void run() {
            synchronized (lock) {
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread() + " flag is true. wait @ "
                                           + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println(Thread.currentThread() + " flag is false. running @ "
                                   + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }

    static class Notify implements Runnable {
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock. notify @ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                SleepUtils.second(5);
            }
            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock again. sleep @ "
                                   + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                SleepUtils.second(5);
            }
        }
    }
}
