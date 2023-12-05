package ru.lainer.course.eight8.threemethods;

public class Main {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread threadMobile = new Thread(new RunnableForMobile(lock));
        Thread threadSkype = new Thread(new RunnableForSkype(lock));
        Thread threadTelegram = new Thread(new RunnableForTelegram(lock));
        threadMobile.start();
        threadSkype.start();
        threadTelegram.start();
    }
}
