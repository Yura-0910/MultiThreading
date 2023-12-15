package ru.lainer.course.eight11.ex1;

import java.util.concurrent.locks.Lock;

public class MobileCall {
    private Lock lock ;

    public MobileCall(Lock lock) {
        this.lock = lock;
    }

    public void mobileCall(){
        lock.lock();
        try {
            System.out.println("Начали mobileCall");
            Thread.sleep(3000);
            System.out.println("Завершили mobileCall");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
