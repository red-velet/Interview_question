package singleton.hungry;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 7:59
 * Description: No Description
 */
public class Singleton {
    /**
     * 将自身实例化对象设置为一个属性，并用static修饰
     */
    private static final Singleton INSTANCE = new Singleton();

    /**
     * 私有化构造器
     */
    private Singleton() {
    }

    /**
     * 静态方法返回该实例
     *
     * @return 实例
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
