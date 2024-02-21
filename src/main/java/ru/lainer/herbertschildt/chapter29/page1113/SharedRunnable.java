package ru.lainer.herbertschildt.chapter29.page1113;

public class SharedRunnable implements Runnable{
    private String threadName;

    public SharedRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Поток " + threadName + ": установил = " +
                               Shared.atomicInteger.incrementAndGet());
        }
    }
}
