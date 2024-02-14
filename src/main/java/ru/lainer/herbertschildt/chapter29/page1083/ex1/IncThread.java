package ru.lainer.herbertschildt.chapter29.page1083.ex1;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable{
    private final String threadName;
    private final Semaphore semaphore;

    public IncThread(String threadName, Semaphore semaphore) {
        this.threadName = threadName;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println("Запущен поток " + threadName);
            System.out.println("Поток " + threadName + " ожидает разрешения");
            semaphore.acquire();
            System.out.println("Поток " + threadName + " получил разрешение");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println("Поток " + threadName + ":" + Shared.count);
                //sleep - может позволить переключить контекст
                Thread.sleep(100);
            }
            System.out.println("Поток " + threadName + " освободил разрешение");
            semaphore.release();
        } catch (InterruptedException e) {
            System.out.println("Что-то не так");
        }

    }
}
