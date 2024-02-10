package ru.lainer.herbertschildt.chapter11.page316;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Thread firstThread = new Thread(new Producer(market));
        Thread secondThread = new Thread(new Consumer(market));

        firstThread.start();
        secondThread.start();
    }
}
