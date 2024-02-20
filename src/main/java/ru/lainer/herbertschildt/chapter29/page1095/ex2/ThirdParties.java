package ru.lainer.herbertschildt.chapter29.page1095.ex2;

import java.util.concurrent.Phaser;

public class ThirdParties implements Runnable{
    private String threadName;
    private Phaser phaser;

    public ThirdParties(String threadName, Phaser phaser) {
        this.threadName = threadName;
        this.phaser = phaser;
        this.phaser.register();
    }

    @Override
    public void run() {
        int currentPhase; //Текущая стадия

        System.out.println("Поток " + threadName + " начал первую стадию");
        currentPhase = phaser.getPhase() + 1;
        phaser.arriveAndAwaitAdvance();
        System.out.println("Стадия " + currentPhase + " завершена");

        System.out.println("Поток " + threadName + " начал вторую стадию");
        currentPhase = phaser.getPhase() + 1;
        phaser.arriveAndAwaitAdvance();
        System.out.println("Стадия " + currentPhase + " завершена");

        System.out.println("Поток " + threadName + " начал третью стадию");
        currentPhase = phaser.getPhase() + 1;
        phaser.arriveAndAwaitAdvance();
        System.out.println("Стадия " + currentPhase + " завершена");

        // Отменить регистрацию потока ThirdParties
        phaser.arriveAndDeregister();

        if(phaser.isTerminated())
         System.out.println("Объект Phaser закончил работу");
    }
}
