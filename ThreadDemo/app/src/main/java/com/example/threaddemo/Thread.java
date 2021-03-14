package com.example.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


public class Thread {
    
    /*
        Executors获取ExecutorService,然后调用方法,提交任务;
     */

    public static void main() {
        test();
    }

    //练习方法newFixedThreadPool

    private static void test() {
        //1:使用工厂类获取线程池对象
        ExecutorService es = Executors.newFixedThreadPool(10);
        //2:提交任务;
        for (int i = 1; i <=10 ; i++) {
            es.submit(new MyRunnable(i));
        }
    }

    /*
    任务类,包含一个任务编号
 */
    static class MyRunnable implements Runnable{

        private int id;

        public MyRunnable(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            Http.get();
        }
}
}

