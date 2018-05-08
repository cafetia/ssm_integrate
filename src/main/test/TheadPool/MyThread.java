package TheadPool;

public class MyThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--正在执行！");
    }
}
