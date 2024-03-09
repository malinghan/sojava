package com.someecho.sojava.thread.artconcurrentbook.chapter03.lock1;

class SynchronizedExample {
    int     a    = 0;
    boolean flag = false;

    public synchronized void writer() {
        a = 1;
        flag = true;
    }

    public synchronized void reader() {
        if (flag) {
            int i = a;
        }
    }
}