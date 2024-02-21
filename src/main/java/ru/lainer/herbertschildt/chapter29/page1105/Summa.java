package ru.lainer.herbertschildt.chapter29.page1105;

import java.util.concurrent.Callable;

public class Summa implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int summa = 0;
        for (int i = 0; i < 10; i++) {
            summa = summa + i;
        }
        return summa;
    }
}
