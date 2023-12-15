package ru.lainer.course.eight11.ex1;

import java.util.concurrent.locks.Lock;

public class SkypeCall {
    private Lock lock ;

    public SkypeCall(Lock lock) {
        this.lock = lock;
    }

    public void skypeCall(){
        lock.lock();
        try {
            System.out.println("Начали skypeCall");
            Thread.sleep(5000);
            System.out.println("Завершили skypeCall");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
