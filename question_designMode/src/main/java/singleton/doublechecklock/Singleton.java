package singleton.doublechecklock;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 7:52
 * Description: 双重检查锁实现单例设计模式(懒汉式)
 */
public class Singleton {
    private static volatile Singleton singleton;
    private final static Object MONITOR = new Object();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (MONITOR) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
                return singleton;
            }
        }
        return singleton;
    }
}
