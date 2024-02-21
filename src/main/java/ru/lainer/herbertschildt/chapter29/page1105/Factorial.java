package ru.lainer.herbertschildt.chapter29.page1105;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int factorial = 1;
        for (int i = 1; i <= 3; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
}
