package ru.lainer.course.eight9.syncmethod;

import ru.lainer.course.eight9.syncmethod.Market;

public class Producer implements Runnable{
    private final Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}
