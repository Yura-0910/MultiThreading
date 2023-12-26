package ru.lainer.course.eight17.summa;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static final long maxValue = 1_000_000_000L;
    private static final long valueDividedBy10 = maxValue/10;
    private static long from;
    private static long to;
    private static long sum;
    
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResult = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            from = valueDividedBy10*i + 1;
            to = valueDividedBy10*(i+1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futureWithSum = executorService.submit(task);
            futureResult.add(futureWithSum);
        }
        for (Future<Long> result: futureResult) {
            sum = sum + result.get();
        }
        executorService.shutdown();
        System.out.println("Итоговая сумма = " + sum);
    }
}
