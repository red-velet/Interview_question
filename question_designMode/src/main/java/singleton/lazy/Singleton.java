package singleton.lazy;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 7:57
 * Description: 单例设计模式-懒汉式
 */
public class Singleton {
    /**
     * 将自身实例化对象设置为一个属性，并用static修饰
     */
    private static Singleton INSTANCE;

    /**
     * 构造方法私有化
     */
    private Singleton() {
    }


    /**
     * 静态方法返回该实例
     *
     * @return 实例
     */
    public static Singleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
