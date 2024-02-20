package ru.lainer.herbertschildt.chapter29.page1104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начало main");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new ThreadWithTask("A"));
        executorService.execute(new ThreadWithTask("B"));
        executorService.execute(new ThreadWithTask("C"));
        executorService.execute(new ThreadWithTask("D"));
        executorService.shutdown();
        executorService.awaitTermination(20, TimeUnit.SECONDS);
        System.out.println("Окончание main");
    }
}
