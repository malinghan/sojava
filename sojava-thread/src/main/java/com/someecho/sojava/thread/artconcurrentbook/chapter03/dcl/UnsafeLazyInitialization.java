package com.someecho.sojava.thread.artconcurrentbook.chapter03.dcl;

/**
 * 存在线程安全问题的单例
 */
public class UnsafeLazyInitialization {
    private static Instance instance;

    public static Instance getInstance() {
        if (instance == null) //1ŁşAĎßłĚÖ´ĐĐ
            instance = new Instance(); //2ŁşBĎßłĚÖ´ĐĐ
        return instance;
    }

    static class Instance {
    }
}