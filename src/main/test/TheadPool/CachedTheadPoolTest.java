package TheadPool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 它是一个可以无限扩大的线程池；它比较适合处理执行时间比较小的任务；corePoolSize为0，maximumPoolSize为无限大，
 * 意味着线程数量可以无限大；keepAliveTime为60S，意味着线程空闲时间超过60S就会被杀死；采用SynchronousQueue装等待的任务，
 * 这个阻塞队列没有存储空间，这意味着只要有请求到来，就必须要找到一条工作线程处理他，如果当前没有空闲的线程，那么就会再创建一条新的线程。
 */
public class CachedTheadPoolTest {
    public static void main(String[] args) {
        //多线程 --创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int h=0;h<=10;h++) {
            final int hh = h;
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(2000);
                        System.out.println("缓存多线程正在执行" + hh + "个线程");
                        System.out.println(new Date().getSeconds());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }




        //另外的写法
//        Executors.newCachedThreadPool().execute(new Runnable() {
//            public void run() {
//              System.out.println("执行了呀!");
//            }
//        });
    }
}
