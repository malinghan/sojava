package com.someecho.sojava.thread.artconcurrentbook.chapter04.threadpool;

/**
 * 6-19 简单的线程池接口定义
 */
public interface ThreadPool<Job extends Runnable> {
    void execute(Job job);

    void shutdown();

    void addWorkers(int num);

    void removeWorker(int num);

    int getJobSize();
}
