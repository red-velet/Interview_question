package icu.chiou.lock;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/16
 * Time: 16:55
 * Description: wait() sleep()方法的作用和区别
 */
public class WaitAndNotifyTest {
    public static final WaitAndNotifyTest MONITOR = new WaitAndNotifyTest();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (MONITOR) {
                System.out.println("线程1开始了.....");
                try {
                    System.out.println("线程1wait()了.....");
                    MONITOR.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程1结束了.....");
            }
        }).start();

        new Thread(() -> {
            synchronized (MONITOR) {
                System.out.println("线程1wait()，线程2抢到锁，线程2开始了.....");
                try {
                    System.out.println("线程2 sleep()5秒钟.....");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程2唤醒notify().....");
                MONITOR.notify();
                System.out.println("线程2结束了.....");
            }
        }).start();
        new Thread(() -> {
            synchronized (MONITOR) {
                System.out.println("线程3抢到锁，线程3开始了.....");
                System.out.println("线程3结束了.....");
            }
        }).start();
    }
}
