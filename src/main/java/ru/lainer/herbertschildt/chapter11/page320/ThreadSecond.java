package ru.lainer.herbertschildt.chapter11.page320;

public class ThreadSecond implements Runnable{
    private final Rucksack rucksack;
    private final Tent tent;

    public ThreadSecond(Rucksack rucksack, Tent tent) {
        this.rucksack = rucksack;
        this.tent = tent;
    }

    @Override
    public void run() {
        try {
            tent.openTent(rucksack);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
