package singleton.inner;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 8:09
 * Description: No Description
 */
public class InnerTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
