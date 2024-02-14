package ru.lainer.herbertschildt.chapter29.page1090;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class JupiterThread implements Runnable{
    private String threadName;
    private CyclicBarrier cyclicBarrier;

    public JupiterThread(String threadName, CyclicBarrier cyclicBarrier) {
        this.threadName = threadName;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        int order = -5;
        try {
            System.out.println("Поток " + threadName + " начал работу");
            order = cyclicBarrier.await();
            System.out.println("Поток " + threadName + " : после await()");
            System.out.println("Поток " + threadName + " : порядок достижения = " + order);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
