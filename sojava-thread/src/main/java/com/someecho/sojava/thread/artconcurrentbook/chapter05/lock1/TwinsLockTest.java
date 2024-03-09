/**
 * 
 */
package com.someecho.sojava.thread.artconcurrentbook.chapter05.lock1;

import java.util.concurrent.locks.Lock;

import org.junit.jupiter.api.Test;

import com.someecho.sojava.thread.artconcurrentbook.chapter04.SleepUtils;
import com.someecho.sojava.thread.artconcurrentbook.chapter05.lock1.TwinsLock;

/**
 * 10-11
 */
public class TwinsLockTest {
    public static void main(String[] args) {
        new TwinsLockTest().test();
    }

    @Test
    public void test() {
        final Lock lock = new TwinsLock();
        class Worker extends Thread {
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepUtils.second(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtils.second(1);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }
        for (int i = 0; i < 10; i++) {
            SleepUtils.second(1);
            System.out.println();
        }
    }
}
