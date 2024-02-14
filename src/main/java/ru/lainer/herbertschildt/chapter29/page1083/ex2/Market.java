package ru.lainer.herbertschildt.chapter29.page1083.ex2;

import java.util.concurrent.Semaphore;

public class Market {
    private int count;
    private final static Semaphore semProducer = new Semaphore(1);

    //permits = 0, но если выполнить release(), то permits будет = 1
    private final static Semaphore semConsumer = new Semaphore(0);

    public void put() throws InterruptedException {
        semProducer.acquire();
        count++;
        System.out.println("Добавлено : " + count);
        semConsumer.release();
    }

    public void get() throws InterruptedException {
        semConsumer.acquire();
        System.out.println("Получено : " + count);
        semProducer.release();
    }
}
