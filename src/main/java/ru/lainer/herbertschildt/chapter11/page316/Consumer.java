package ru.lainer.herbertschildt.chapter11.page316;

public class Consumer implements Runnable{
    private final Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        while (true){
            market.getFishFromMarket();
        }
    }
}
