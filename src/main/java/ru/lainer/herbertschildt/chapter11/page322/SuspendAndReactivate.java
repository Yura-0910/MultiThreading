package ru.lainer.herbertschildt.chapter11.page322;

public class SuspendAndReactivate implements Runnable{
    private final Counter counter;

    public SuspendAndReactivate(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            System.out.println("Перед приостановкой потока: ждем 2 сек");
            Thread.sleep(2000); //Чтоб поток Everest успел немного вывести на экран
            System.out.println("Перед вызовом suspendThread()");
            counter.suspendThread();
            System.out.println("Перед активизацией потока: ждем 4 сек");
            Thread.sleep(4000);
            System.out.println("Перед вызовом reactivateThread()");
            counter.reactivateThread();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
