package singleton.inner;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 8:07
 * Description: 内部内实现单例设计模式
 */
public class Singleton {
    /**
     * 构造器私有化，防止外部实例化
     */
    private Singleton() {
    }

    /**
     * 返回单例实例的静态方法
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 写一个静态内部类，里面实例化外部类
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 测试单例是否唯一
     */
    public static void main(String[] args) {
        System.out.println(singleton.enum_.Singleton.getInstance() == singleton.enum_.Singleton.getInstance());
    }
}
