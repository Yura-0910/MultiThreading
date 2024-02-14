package ru.lainer.herbertschildt.chapter29.page1088;

import java.util.concurrent.CountDownLatch;

public class ThreadCDLatch implements Runnable{
    private CountDownLatch countDownLatch;

    public ThreadCDLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            countDownLatch.countDown();
        }
    }
}
