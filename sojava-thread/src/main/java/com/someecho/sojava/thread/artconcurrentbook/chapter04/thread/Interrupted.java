package com.someecho.sojava.thread.artconcurrentbook.chapter04.thread;

import java.util.concurrent.TimeUnit;

import com.someecho.sojava.thread.artconcurrentbook.chapter04.SleepUtils;

/**
 * 6-7
 * 抛出InterruptedException的线程SleepThread，其中断标识位被清除了，
 * 而一直忙碌运作的线程BusyThread，中断标识位没有被清除
 */
public class Interrupted {

    public static void main(String[] args) throws Exception {
        Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
        sleepThread.setDaemon(true);
        Thread busyThread = new Thread(new BusyRunner(), "BusyThread");
        busyThread.setDaemon(true);
        sleepThread.start();
        busyThread.start();
        TimeUnit.SECONDS.sleep(5);
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println("SleepThread interrupted is " + sleepThread.isInterrupted());
        System.out.println("BusyThread interrupted is " + busyThread.isInterrupted());
        TimeUnit.SECONDS.sleep(2);
    }

    static class SleepRunner implements Runnable {
        @Override
        public void run() {
            while (true) {
                SleepUtils.second(10);
            }
        }
    }

    static class BusyRunner implements Runnable {
        @Override
        public void run() {
            while (true) {
            }
        }
    }
}
