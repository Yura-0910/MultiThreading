package ru.lainer.herbertschildt.chapter11.page316;

public class Producer implements Runnable{
    private final Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        int fishCount = 0;
        while (true){
            market.addFishToMarket(fishCount++);
        }
    }
}
