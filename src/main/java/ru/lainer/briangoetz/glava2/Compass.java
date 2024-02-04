package ru.lainer.briangoetz.glava2;

public class Compass {
    private final Object lock = new Object();

    public void toNorth() throws InterruptedException {
        synchronized (lock){
            System.out.println("Начал работать метод toNorth в потоке = " +
                               Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("Завершил работать метод toNorth в потоке = " +
                               Thread.currentThread().getName());
        }
    }

    public void toSouth() throws InterruptedException {
        synchronized (lock){
            System.out.println("Начал работать метод toSouth в потоке = " +
                    Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("Завершил работать метод toSouth в потоке = " +
                    Thread.currentThread().getName());
        }
    }
}
