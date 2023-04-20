package icu.chiou.throwable_;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/20
 * Time: 15:10
 * Description: No Description
 */
public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(test2());
    }

    public static int test2() {
        //try 语句块中有 return 语句时的整体执行顺序
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i = 10;
            System.out.println("finally block i = " + i);
        }
        /**
         * public static int test2() {
         *         int i = 1;
         *
         *         int var2;
         *         try {
         *             ++i;
         *             System.out.println("try block, i = " + i);
         *             int var1 = i;
         *             return var1;
         *         } catch (Exception var6) {
         *             ++i;
         *             System.out.println("catch block i = " + i);
         *             var2 = i;
         *         } finally {
         *             int i = 10;
         *             System.out.println("finally block i = " + i);
         *         }
         *
         *         return var2;
         *     }
         */
    }

    public static Integer test() {
        //finally 语句块中有 return 语句
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i++;
            System.out.println("finally block i = " + i);
            return i;
        }
        /**
         * public static Integer test() {
         *         int i = 1;
         *
         *         try {
         *             ++i;
         *             System.out.println("try block, i = " + i);
         *             Integer var1 = i;
         *         } catch (Exception var6) {
         *             ++i;
         *             System.out.println("catch block i = " + i);
         *             Integer var2 = i;
         *         } finally {
         *             ++i;
         *             System.out.println("finally block i = " + i);
         *             return i;
         *         }
         *     }
         */
    }
}
