package icu.chiou.example;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 14:55
 * Description: No Description
 */
@AllArgsConstructor
public class LockTicket implements Runnable {
    private String name;
    private static Integer num = 100;
    public static final Lock LOCK = new ReentrantLock();

    @Override
    public void run() {
        while (num > 0) {
            LOCK.lock();
            try {
                if (num > 0) {
                    System.out.println(name + "售出一张票,余票" + --num);
                } else {
                    System.out.println(name + "票已售完,余票" + num);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                LOCK.unlock();
            }

        }
    }

    public static void main(String[] args) {
        LockTicket lockTicket1 = new LockTicket("一号窗口");
        LockTicket lockTicket2 = new LockTicket("一号窗口");
        LockTicket lockTicket3 = new LockTicket("一号窗口");

        new Thread(lockTicket1).start();
        new Thread(lockTicket2).start();
        new Thread(lockTicket3).start();
        
    }
}
