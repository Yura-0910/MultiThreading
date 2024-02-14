package ru.lainer.herbertschildt.chapter29.page1083.ex2;

public class ThreadConsumer implements Runnable{
    private Market market;

    public ThreadConsumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                market.get();
            } catch (InterruptedException e) {
                System.out.println("Где-то ошибка");
            }
        }
    }
}
