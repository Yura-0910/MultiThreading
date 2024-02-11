package ru.lainer.herbertschildt.chapter11.page320;

public class Main {
    public static void main(String[] args) {
        Rucksack rucksack = new Rucksack();
        Tent tent = new Tent();

        Thread firstThread = new Thread(new ThreadFirst(rucksack, tent));
        Thread secondThread = new Thread(new ThreadSecond(rucksack, tent));

        firstThread.setName("FirstThread");
        secondThread.setName("SecondThread");

        firstThread.start();
        secondThread.start();
    }
}
