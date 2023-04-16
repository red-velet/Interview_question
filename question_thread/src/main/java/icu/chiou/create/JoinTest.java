package icu.chiou.create;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/14
 * Time: 15:06
 * Description: join方法的作用
 */
@Slf4j
public class JoinTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                log.info("t1线程运行" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            int count = 0;
            while (true) {
                count++;
                log.info("t2.............");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (count == 10) {
                    try {
                        t1.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
