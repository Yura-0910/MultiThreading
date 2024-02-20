package ru.lainer.herbertschildt.chapter29.page1095.ex3;

import java.util.concurrent.Phaser;

public class ThreadWithAwaitAdvance implements Runnable{
    private String threadName;
    private Phaser phaser;

    public ThreadWithAwaitAdvance(String threadName, Phaser phaser) {
        this.threadName = threadName;
        this.phaser = phaser;
        this.phaser.register();
    }

    public void ArriveAndWait(){
        int phase = phaser.getPhase();
        System.out.println("Перед " + " phaser.arrive(), стадия = " + phase);

        phase = phaser.arrive();
        phaser.awaitAdvance(phase);

        phase = phaser.getPhase();
        System.out.println("После " + " awaitAdvance, стадия = " + phase);
        System.out.println("-----------------");
    }
    @Override
    public void run() {
        ArriveAndWait();
        ArriveAndWait();
        ArriveAndWait();

        phaser.arriveAndDeregister();
    }
}
