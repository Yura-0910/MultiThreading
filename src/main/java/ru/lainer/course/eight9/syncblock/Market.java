package ru.lainer.course.eight9.syncblock;

public class Market {
    private int breadCount;
    private final Object lock = new Object();

    public void getBread(){
        synchronized (lock){
            while (breadCount < 1){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Потребитель купил 1 буханку хлеба");
            System.out.println("Количество хлеба в магазине = " + breadCount);
            lock.notify();
        }
    }

    public void putBread(){
        synchronized (lock){
            while (breadCount >=5){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("На витрину добавлена 1 буханка");
            System.out.println("Количество хлеба в магазине = " + breadCount);
            lock.notify();
        }
    }
}