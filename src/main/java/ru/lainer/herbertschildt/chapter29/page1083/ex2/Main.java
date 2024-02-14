package ru.lainer.herbertschildt.chapter29.page1083.ex2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        new Thread(new ThreadProducer(market)).start();
        new Thread(new ThreadConsumer(market)).start();
    }
}
