package com.someecho.sojava.thread.artconcurrentbook.chapter03.dcl;

/**
 * 线程安全的双检查锁
 * 1. instance使用volatile static修饰
 * 2. getInstance() 不使用 synchronized修饰
 * 3. 2次判空检查，第一次不使用synchronized修饰，第二是使用其修饰
 *
 * instance使用volatile修饰，是的，instance的内存地址在多线程下是可见的,修改操作是原子性的
 */
public class SafeDoubleCheckedLocking {
    private volatile static Instance instance;

    public static Instance getInstance() {
        if (instance == null) {
            synchronized (SafeDoubleCheckedLocking.class) {
                if (instance == null)
                    instance = new Instance();//instance
            }
        }
        return instance;
    }

    static class Instance {
    }
}