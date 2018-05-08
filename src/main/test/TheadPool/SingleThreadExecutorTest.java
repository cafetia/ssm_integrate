package TheadPool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
它只会创建一条工作线程处理任务；
采用的阻塞队列为LinkedBlockingQueue；
 */
public class SingleThreadExecutorTest {
    public static void main(String[] args) {
        //单线程  -- 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        /*for ( int j= 0;j<=10 ;j++){
            final  int jj= j;
            executorService1.execute(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(2000);
                        System.out.println("单线程正在执行第"+jj+"个线程。");
                        System.out.println(new Date().getSeconds());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }*/

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();


        executorService1.execute(myThread1);
        executorService1.execute(myThread2);
        executorService1.execute(myThread3);
    }
}
