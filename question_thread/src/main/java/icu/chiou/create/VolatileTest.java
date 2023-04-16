package icu.chiou.create;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/14
 * Time: 15:44
 * Description: No Description
 */
public class VolatileTest {
//    /**
//     * 没加volatile关键字
//     */
//    public static boolean flag = false;

    /**
     * 加volatile关键字
     */
    public static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            while (!flag) {
            }
            System.out.println("你看到我了");
        }).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        flag = true;
    }
}
