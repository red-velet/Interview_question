package singleton.lazy;


/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 7:58
 * Description: No Description
 */
public class LazyTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getINSTANCE();
        Singleton instance2 = Singleton.getINSTANCE();
        System.out.println(instance1 == instance2);
    }
}
