package ru.lainer.herbertschildt.chapter11.page314;

public class Main {
    public static void main(String[] args) {
        NotSynchronizedClass notSynchronizedClass = new NotSynchronizedClass();
        Thread threadFirst = new Thread(new ThreadFirst(notSynchronizedClass));
        Thread threadSecond = new Thread(new ThreadSecond(notSynchronizedClass));
        threadFirst.start();
        threadSecond.start();
    }
}
