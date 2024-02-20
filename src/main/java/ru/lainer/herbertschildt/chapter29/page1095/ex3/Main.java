package ru.lainer.herbertschildt.chapter29.page1095.ex3;

import java.util.concurrent.Phaser;

/*
  ex3 - пример на работу awaitAdvance
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser();
        phaser.register();
        new Thread(new ThreadWithAwaitAdvance("A", phaser)).start();
        System.out.println("phaser = " + phaser);

        Thread.sleep(10000);
        System.out.println("0-Поток main начал стадию = " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();

        Thread.sleep(10000);
        System.out.println("1-Поток main начал стадию = " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();

        Thread.sleep(10000);
        System.out.println("2-Поток main начал стадию = " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();

        phaser.arriveAndDeregister();

        if(phaser.isTerminated()) {
            System.out.println("Объект Phaser закончил работу");
        }
        System.out.println("После завершения Phaser, стадия = " + phaser.arrive());
    }
}
