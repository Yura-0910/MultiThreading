package ru.lainer.course.eight14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
         Первый популярный способ создания ThreadPool
         ExecutorService executorService = Executors.newFixedThreadPool(5);
        */

        //Еще один способ создания ThreadPool
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Ends main");
    }
}
