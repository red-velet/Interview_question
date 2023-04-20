package icu.chiou.example;

import lombok.AllArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/17
 * Time: 14:50
 * Description: No Description
 */
@AllArgsConstructor
public class SyncTicket implements Runnable {
    private String name;
    private static Integer num = 100;
    public static final Object MONITOR = new Object();

    @Override
    public void run() {
        while (num > 0) {
            synchronized (MONITOR) {
                if (num > 0) {
                    System.out.println(name + "售出一张票,余票" + --num);
                } else {
                    System.out.println(name + "票已售完,余票" + num);
                }
            }
        }
    }

    public static void main(String[] args) {
        SyncTicket syncTicket1 = new SyncTicket("一号窗口");
        SyncTicket syncTicket2 = new SyncTicket("二号窗口");
        SyncTicket syncTicket3 = new SyncTicket("三号窗口");
        new Thread(syncTicket1).start();
        new Thread(syncTicket2).start();
        new Thread(syncTicket3).start();
    }
}
