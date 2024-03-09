package com.someecho.sojava.thread.artconcurrentbook.chapter04.thread;

import java.util.concurrent.TimeUnit;

/**
 * 6-9
 * 创建了一个线程CountThread，它不断地进行变量累加，而主线程尝试对其进行中断操作和停止操作。
 * 示例在执行过程中，main线程通过中断操作和cancel()方法均可使CountThread得以终止。
 * 这种通过标识位或者中断操作的方式能够使线程在终止时有机会去清理资源，
 * 而不是武断地将线程停止，因此这种终止线程的做法显得更加安全和优雅。
 */
public class Shutdown {
    public static void main(String[] args) throws Exception {
        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread");
        countThread.start();
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();
        Runner two = new Runner();
        countThread = new Thread(two, "CountThread");
        countThread.start();
        TimeUnit.SECONDS.sleep(1);
        two.cancel();
    }

    private static class Runner implements Runnable {
        private long             i;

        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i = " + i);
        }

        public void cancel() {
            on = false;
        }
    }
}
