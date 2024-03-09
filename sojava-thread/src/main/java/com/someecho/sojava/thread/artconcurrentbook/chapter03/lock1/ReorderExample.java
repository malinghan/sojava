package com.someecho.sojava.thread.artconcurrentbook.chapter03.lock1;

/**
 * 测试重排序是否会影响多线程程序的执行结果?
 */
class ReorderExample {
    int     a    = 0;
    boolean flag = false;

    public void writer() {
        a = 1; //1
        flag = true; //2
    }

    public void reader() {
        if (flag) { //3
            int i = a * a; //4
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ReorderExample reorderExample = new ReorderExample();
        Thread writerA = new Thread(reorderExample::writer);

        Thread readB = new Thread(reorderExample::reader);

        writerA.start();
        readB.start();
    }
}