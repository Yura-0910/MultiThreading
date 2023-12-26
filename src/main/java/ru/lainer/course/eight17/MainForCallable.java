package ru.lainer.course.eight17;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainForCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialWithCallable factorialWithCallable = new FactorialWithCallable(5);
        Factorial factorialWithRunnable = new Factorial(6);
        //Future<Integer> future = executorService.submit(factorialWithCallable);
        Future future = executorService.submit(factorialWithRunnable);
        try {
            System.out.println("Task завершился ? " + future.isDone());
            System.out.println("Хотим получить результат факториала");
            System.out.println("Факториал = " + future.get());
            System.out.println("Факториал = " + factorialWithRunnable.getFactorialResult());
            System.out.println("Получили результат факториала");
            System.out.println("Task завершился ? " + future.isDone());
        }
        catch (InterruptedException | ExecutionException e) {
            System.out.println("Причина = "  + e.getCause());
        }
        finally {
            executorService.shutdown();
        }
    }
}
