package ru.lainer.course.eight21;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void increment(){
        //count.incrementAndGet();
        //count.addAndGet(5);
        count.addAndGet(-5);
        //count.getAndAdd(6);
    }

    public static int getCount() {
        return count.get();
    }
}
