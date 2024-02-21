package ru.lainer.herbertschildt.chapter29.page1110;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Shared sharedCode = new Shared(reentrantLock);

        Thread firstThread = new Thread(new FirstRunnable(sharedCode));
        Thread secondThread = new Thread(new SecondRunnable(sharedCode));

        firstThread.setName("FirstThread");
        secondThread.setName("SecondThread");

        firstThread.start();
        secondThread.start();
    }
}
