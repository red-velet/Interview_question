package icu.chiou.lock;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/16
 * Time: 10:06
 * Description: 锁实例方法和静态方法的区别
 */
public class ObjectAndClassWithLock {
    public static final ObjectAndClassWithLock OBJECT_AND_CLASS_WITH_LOCK = new ObjectAndClassWithLock();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                rap(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + "按序执行了吗？");
            }).start();
        }

//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                new ObjectAndClassWithLock().say(Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getName() + "按序执行了吗？");
//            }).start();
//        }
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                synchronized (ObjectAndClassWithLock.class) {
//                    System.out.println(Thread.currentThread().getName() + "-----------------hello world-----------------");
//                    System.out.println(Thread.currentThread().getName() + "按序执行了吗？");
//                    try {
//                        Thread.sleep(200);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }).start();
//        }
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                OBJECT_AND_CLASS_WITH_LOCK.say(Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getName() + "按序执行了吗？");
//
//            }).start();
//        }
    }

    public synchronized void say(String msg) {
        System.out.println(msg + "-----------------hello world-----------------");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static void rap(String msg) {
        System.out.println(msg + "-----------------hello world-----------------");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
