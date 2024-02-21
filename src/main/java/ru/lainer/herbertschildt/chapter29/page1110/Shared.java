package ru.lainer.herbertschildt.chapter29.page1110;

import java.util.concurrent.locks.ReentrantLock;

public class Shared {
    private final ReentrantLock reentrantLock;
    private static int count;

    public Shared(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }

    public void runTask(){
        try {
            System.out.println(Thread.currentThread().getName() + " ожидает блокировку");
            reentrantLock.lock();
            System.out.println(Thread.currentThread().getName() + " захватил блокировку");
            for (int i = 0; i < 5; i++) {
                count++;
                System.out.println("Поток " + Thread.currentThread().getName() + " : " + count);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Что-то не так");
        } finally {
            System.out.println(Thread.currentThread().getName() + " снял блокировку");
            reentrantLock.unlock();
        }
    }
}
