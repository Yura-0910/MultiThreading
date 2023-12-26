package ru.lainer.course.eight17.summa;

import java.util.concurrent.Callable;

public class PartialSum implements Callable<Long> {
    private final long from;
    private final long to;
    private long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Сумма от " + from + " до " + to + " равна = " + localSum);
        return localSum;
    }
}
