package ru.lainer.herbertschildt.chapter29.page1095.ex1;

import java.util.concurrent.Phaser;

public class DeregisterForThreads implements Runnable{
    private String threadName;
    private Phaser phaser;

    public DeregisterForThreads(String threadName, Phaser phaser) {
        this.threadName = threadName;
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("Поток " + threadName + " начал первую стадию. Дальше не ждите меня");
        phaser.arriveAndDeregister();
    }
}
