package icu.chiou.create;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/14
 * Time: 14:47
 * Description: 守护线程测试
 */
@Slf4j
public class DaemonThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Thread t2 = new Thread(() -> {
                while (true) {
                    log.info("t1守护线程--垃圾回收、性能监控...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            t2.setDaemon(true);
            t2.start();
            for (int i = 0; i < 20; i++) {
                log.info("t1线程运行" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
    }
}
