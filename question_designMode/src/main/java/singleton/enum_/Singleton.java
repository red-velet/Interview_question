package singleton.enum_;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 8:05
 * Description: 使用枚举类实现单例设计模式
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
        return SingletonHolder.INSTANT.instance;
    }

    /**
     * 静态内部枚举类，实例化单例对象
     */
    private enum SingletonHolder {
        INSTANT;
        private final Singleton instance;

        /**
         * 实例化单例对象
         */
        SingletonHolder() {
            instance = new Singleton();
        }

    }

    /**
     * 测试单例是否唯一
     */
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
