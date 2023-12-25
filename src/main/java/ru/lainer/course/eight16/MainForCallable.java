package ru.lainer.course.eight16;

import java.util.concurrent.*;

public class MainForCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialWithCallable factorial = new FactorialWithCallable(5);
        Future<Integer> future = executorService.submit(factorial);
        try {
            System.out.println("Факториал = " + future.get());
        }
        catch (InterruptedException | ExecutionException e) {
            System.out.println("Причина = "  + e.getCause());
        }
        finally {
            executorService.shutdown();
        }
    }
}
