package ru.lainer.herbertschildt.chapter29.page1105;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> summa = executorService.submit(new Summa());
        Future<Integer> factorial = executorService.submit(new Factorial());

        System.out.println("Сумма = " + summa.get());
        System.out.println("Факториал = " + factorial.get());

        executorService.shutdown();
    }
}
