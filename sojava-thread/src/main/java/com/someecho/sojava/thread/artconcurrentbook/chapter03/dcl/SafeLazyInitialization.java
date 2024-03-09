package com.someecho.sojava.thread.artconcurrentbook.chapter03.dcl;

/**
 * 线程安全的单例，但锁的是整个对象，性能较差
 */
public class SafeLazyInitialization {
    private static Instance instance;

    public synchronized static Instance getInstance() {
        if (instance == null)
            instance = new Instance();
        return instance;
    }

    static class Instance {
    }
}