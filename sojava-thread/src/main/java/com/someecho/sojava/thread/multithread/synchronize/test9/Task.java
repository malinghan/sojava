package com.someecho.sojava.thread.multithread.synchronize.test9;

/**
 * Created by mlh on 2017/12/23.
 */

/**
 *
 */
public class Task {
     private String getData1;
     private String getData2;
     public     synchronized  void doLongTimeTask(){
                 try{
                     System.out.println("begin task");
                     Thread.sleep(3000);
                     getData1="长时间处理任务后从远程返回的值1 threadName="+Thread.currentThread().getName();
                     getData2="长时间处理任务后从远程返回的值2 threadName="+Thread.currentThread().getName();
                     System.out.println(getData1);
                     System.out.println(getData2);
                     System.out.println("end task");
                 }catch (Exception e){
                     e.printStackTrace();
                 }
     }
}
