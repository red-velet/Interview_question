package singleton.doublechecklock;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 7:51
 * Description: 双重检查锁实现单例设计模式(懒汉式)测试
 */
public class DoubleCheckLockTest {

    public static void main(String[] args) {
        for (int i = 0; i < 2000; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getSingleton();
                System.out.println(singleton);
            }).start();

        }
    }
}
