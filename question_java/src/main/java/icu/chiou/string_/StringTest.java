package icu.chiou.string_;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/20
 * Time: 14:52
 * Description: 变量拼接底层会使用new StringBuilder对象进行append()
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false
        /**
         * Compiled from "StringTest.java"
         * public class icu.chiou.string_.StringTest {
         *   public icu.chiou.string_.StringTest();
         *     Code:
         *        0: aload_0
         *        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         *        4: return
         *
         *   public static void main(java.lang.String[]);
         *     Code:
         *        0: ldc           #2                  // String str
         *        2: astore_1
         *        3: ldc           #3                  // String ing
         *        5: astore_2
         *        6: ldc           #4                  // String string
         *        8: astore_3
         *        9: new           #5                  // class java/lang/StringBuilder
         *       12: dup
         *       13: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V
         *       16: aload_1
         *       17: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       20: aload_2
         *       21: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       24: invokevirtual #8                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         *       27: astore        4
         *       29: ldc           #4                  // String string
         *       31: astore        5
         *       72: aload         5
         *       74: if_acmpne     81
         *       77: iconst_1
         *       78: goto          82
         *       81: iconst_0
         *       82: invokevirtual #10                 // Method java/io/PrintStream.println:(Z)V
         *       85: return
         * }
         */

    }
}
