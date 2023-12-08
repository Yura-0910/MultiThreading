package ru.lainer.course.eight9.syncmethod;

public class Market {
    private int breadCount;

    public synchronized void getBread(){
        while (breadCount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 буханку хлеба");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }

    public synchronized void putBread(){
        while (breadCount >=5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("На витрину добавлена 1 буханка");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }
}