package icu.chiou.object_;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/20
 * Time: 16:39
 * Description: No Description
 */
public class ObjectSizeTest {
    public static void main(String[] args) {
        //计算一个实例对象在内存的大小
        System.out.println(ObjectSizeCalculator.getObjectSize(new Person("jack", 18)));
    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private int age;
}
