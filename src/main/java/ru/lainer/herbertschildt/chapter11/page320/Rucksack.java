package ru.lainer.herbertschildt.chapter11.page320;

public class Rucksack {
    public synchronized void openRucksack(Tent tent) throws InterruptedException {
        System.out.println("Поток " + Thread.currentThread().getName() + " вошел в openRucksack");
        Thread.sleep(3000);
        System.out.println("Поток " + Thread.currentThread().getName() + " пытается войти в openTent");
        tent.openTent(this);
    }
}
