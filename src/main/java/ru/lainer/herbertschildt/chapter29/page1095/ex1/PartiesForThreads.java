package ru.lainer.herbertschildt.chapter29.page1095.ex1;

import java.util.concurrent.Phaser;

public class PartiesForThreads implements Runnable{
    private String threadName;
    private Phaser phaser;

    public PartiesForThreads(String threadName, Phaser phaser) {
        this.threadName = threadName;
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("Поток " + threadName + " начал первую стадию");
        phaser.arriveAndAwaitAdvance();

        System.out.println("Поток " + threadName + " начал вторую стадию");
        phaser.arriveAndAwaitAdvance();

        System.out.println("Поток " + threadName + " начал третью стадию");
        phaser.arriveAndDeregister();
    }
}
