package ru.lainer.herbertschildt.chapter29.page1088;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начал работу");
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Thread thread = new Thread(new ThreadCDLatch(countDownLatch));
        thread.start();
        countDownLatch.await();
        System.out.println("Поток main завершил работу");
    }
}
