package com.someecho.sojava.thread.artconcurrentbook.chapter04.threadpool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 6-20
 */
public class DefaultThreadPool<Job extends Runnable> implements ThreadPool<Job> {
    private static final int      MAX_WORKER_NUMBERS     = 10; // 线程池最大限制数￼
    private static final int      DEFAULT_WORKER_NUMBERS = 5;  // 线程池默认的数量￼
    private static final int      MIN_WORKER_NUMBERS     = 1;  // 线程池最小的数量￼
    private final LinkedList<Job> jobs                   = new LinkedList<Job>(); // 这是一个工作列表，将会向里面插入工作￼
    private final List<Worker>    workers                = Collections.synchronizedList(new ArrayList<Worker>());  // 工作者列表￼
    private int                   workerNum              = DEFAULT_WORKER_NUMBERS;  // 工作者线程的数量￼
    private AtomicLong            threadNum              = new AtomicLong(); // 工作者线程的数量￼

    public DefaultThreadPool() {
        initializeWokers(DEFAULT_WORKER_NUMBERS);
    }

    public DefaultThreadPool(int num) {
        workerNum = num > MAX_WORKER_NUMBERS ? MAX_WORKER_NUMBERS : Math.max(num, MIN_WORKER_NUMBERS);
        initializeWokers(workerNum);
    }

    public void execute(Job job) {
        if (job != null) {
            // 工作者线程的数量￼
            synchronized (jobs) {
                jobs.addLast(job);
                jobs.notify();
            }
        }
    }

    public void shutdown() {
        for (Worker worker : workers) {
            worker.shutdown();
        }
    }

    public void addWorkers(int num) {
        synchronized (jobs) {
            // 限制新增的Worker数量不能超过最大值￼
            if (num + this.workerNum > MAX_WORKER_NUMBERS) {
                num = MAX_WORKER_NUMBERS - this.workerNum;
            }
            initializeWokers(num);
            this.workerNum += num;
        }
    }

    public void removeWorker(int num) {
        synchronized (jobs) {
            if (num >= this.workerNum) {
                throw new IllegalArgumentException("beyond workNum");
            }
            int count = 0;
            while (count < num) {
                workers.get(count).shutdown();
                count++;
            }
            this.workerNum -= count;
        }
    }

    public int getJobSize() {
        return jobs.size();
    }

    // 初始化线程工作者￼
    private void initializeWokers(int num) {
        for (int i = 0; i < num; i++) {
            Worker worker = new Worker();
            workers.add(worker);
            Thread thread = new Thread(worker, "ThreadPool-Worker-" + threadNum.incrementAndGet());
            thread.start();
        }
    }

    class Worker implements Runnable {
        private volatile boolean running = true;

        public void run() {
            while (running) {
                Job job = null;
                synchronized (jobs) {
                    while (jobs.isEmpty()) {
                        try {
                            jobs.wait();
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    job = jobs.removeFirst();
                }
                if (job != null) {
                    try {
                        job.run();
                    } catch (Exception ex) {
                    }
                }
            }
        }

        public void shutdown() {
            running = false;
        }
    }
}
