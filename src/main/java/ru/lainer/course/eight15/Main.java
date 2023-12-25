package ru.lainer.course.eight15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
        //ExecutorService executorService = Executors.newCachedThreadPool();
        //scheduledExecService.schedule(new RunnableImpl(), 3, TimeUnit.SECONDS);
        //scheduledExecService.scheduleAtFixedRate(new RunnableImpl(), 3, 1, TimeUnit.SECONDS);
        scheduledExecService.scheduleWithFixedDelay(new RunnableImpl(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecService.shutdown();
    }
}
