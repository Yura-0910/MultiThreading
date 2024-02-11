package ru.lainer.herbertschildt.chapter11.page320;

public class ThreadFirst implements Runnable{
    private final Rucksack rucksack;
    private final Tent tent;

    public ThreadFirst(Rucksack rucksack, Tent tent) {
        this.rucksack = rucksack;
        this.tent = tent;
    }

    @Override
    public void run() {
        try {
            rucksack.openRucksack(tent);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
