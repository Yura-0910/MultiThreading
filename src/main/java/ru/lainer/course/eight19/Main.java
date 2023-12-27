package ru.lainer.course.eight19;

import java.util.concurrent.CountDownLatch;

public class Main {
    private static final CountDownLatch countDownLatch = new CountDownLatch(3);
    public static void main(String[] args) throws InterruptedException {
        Friend friendOne = new Friend("Ivan1", countDownLatch);
        Friend friendTwo = new Friend("Ivan2", countDownLatch);
        Friend friendThree = new Friend("Ivan3", countDownLatch);

        friendOne.start();
        friendTwo.start();
        friendThree.start();

        marketStaff();
        everyThinkIsReady();
        openMarket();
    }

    public static void marketStaff() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Персонал пришел на работу");
        countDownLatch.countDown();
        System.out.println("Счетчик CountDownLatch = " + countDownLatch.getCount());
    }

    public static void everyThinkIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Магазин готов к открытию");
        countDownLatch.countDown();
        System.out.println("Счетчик CountDownLatch = " + countDownLatch.getCount());
    }

    public static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Магазин открыт");
        countDownLatch.countDown();
        System.out.println("Счетчик CountDownLatch = " + countDownLatch.getCount());
    }
}
