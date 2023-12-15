package ru.lainer.course.eight11.ex1;

import java.util.concurrent.locks.Lock;

public class TelegramCall {
    private Lock lock ;

    public TelegramCall(Lock lock) {
        this.lock = lock;
    }

    public void telegramCall(){
        lock.lock();
        try {
            System.out.println("Начали telegramCall");
            Thread.sleep(7000);
            System.out.println("Завершили telegramCall");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
