package icu.chiou.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 14:44
 * Description: No Description
 */
public class LockSupportTest {

    public static final Object MONITOR = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            synchronized (MONITOR) {
                System.out.println("线程【" + Thread.currentThread().getName() + "】正在执行。");
                LockSupport.park("我被阻塞了--LockSupport.park()");
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("被中断了");
                }
                System.out.println("继续执行");
            }
        };

        Thread t1 = new Thread(runnable, "线程一");
        Thread t2 = new Thread(runnable, "线程二");

        t1.start();
        Thread.sleep(1000L);
        System.out.println(LockSupport.getBlocker(t1));

        t2.start();
        Thread.sleep(3000L);
        t1.interrupt();
        LockSupport.unpark(t2);
        t1.join();
        t2.join();
    }
}

