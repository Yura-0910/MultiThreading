package ru.lainer.herbertschildt.chapter29.page1104;

public class ThreadWithTask implements Runnable{
    private String threadName;

    public ThreadWithTask(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Поток " + threadName + " начал работать");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Поток " + threadName + " : " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
