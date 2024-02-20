package ru.lainer.herbertschildt.chapter29.page1095.ex2;

import java.util.concurrent.Phaser;

public class SharedCode {
    private String threadName;
    private Phaser phaser;

    public SharedCode(String threadName, Phaser phaser) {
        this.threadName = threadName;
        this.phaser = phaser;
        this.phaser.register();
    }

    public void takeFromHere(){
        try {
            System.out.println("Поток " + threadName + " начал первую стадию");
            phaser.arriveAndAwaitAdvance(); //Сигнализировать о прибытии к барьеру

            //Ждем, чтобы в потоке ThirdParties успела последней вывестись строка ... Стадия завершена...
            Thread.sleep(3000);
            System.out.println("Поток " + threadName + " начал вторую стадию");
            phaser.arriveAndAwaitAdvance(); //Сигнализировать о прибытии к барьеру

            //Ждем, чтобы в потоке ThirdParties успела последней вывестись строка ... Стадия завершена...
            Thread.sleep(3000);
            System.out.println("Поток " + threadName + " начал третью стадию");
            phaser.arriveAndDeregister(); //Сигнализировать о прибытии к барьеру и отменить регистрацию
         } catch (InterruptedException e) {
            System.out.println("Где-то ошибка");;
        }
    }
}
