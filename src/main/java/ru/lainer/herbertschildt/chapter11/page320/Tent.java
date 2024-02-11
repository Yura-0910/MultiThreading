package ru.lainer.herbertschildt.chapter11.page320;

public class Tent {
    public synchronized void openTent(Rucksack rucksack) throws InterruptedException {
        System.out.println("Поток " + Thread.currentThread().getName() + " вошел в openTent");
        Thread.sleep(6000);
        System.out.println("Поток " + Thread.currentThread().getName() + " пытается войти в openRucksack");
        rucksack.openRucksack(this);
    }
}
