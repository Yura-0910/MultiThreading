package ru.lainer.course.eight11.ex1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        MobileCall mobileCall = new MobileCall(lock);
        SkypeCall skypeCall = new SkypeCall(lock);
        TelegramCall telegramCall = new TelegramCall(lock);

        RunnableForMobile runnableForMobile = new RunnableForMobile(mobileCall);
        RunnableForSkype runnableForSkype = new RunnableForSkype(skypeCall);
        RunnableForTelegram runnableForTelegram = new RunnableForTelegram(telegramCall);

        Thread threadOne = new Thread(runnableForMobile);
        Thread threadTwo = new Thread(runnableForSkype);
        Thread threadThree = new Thread(runnableForTelegram);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
