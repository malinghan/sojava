package com.someecho.sojava.thread.artconcurrentbook.chapter05.lock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 10-1
 */
public class LockUseCase {
    public void lock() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
        } finally {
            lock.unlock();
        }
    }
}
