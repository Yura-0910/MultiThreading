package ru.lainer.course.eight6;

public class ThisThreadStopCycle extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Начал работать поток ThisThreadStopCycle");
            ThreadWithCycle threadWithCycle = new ThreadWithCycle();
            threadWithCycle.start();
            Thread.sleep(3000);
            System.out.println("Поток ThisThreadStopCycle закончил ждать 3 сек");
            threadWithCycle.setCycleEndFlag(false);
            threadWithCycle.join();
            System.out.println("Поток ThisThreadStopCycle закончил работать");
        } catch (InterruptedException e) {
            System.out.println("Обработали исключение");
        }
    }
}
