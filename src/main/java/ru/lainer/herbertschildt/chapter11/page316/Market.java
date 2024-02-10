package ru.lainer.herbertschildt.chapter11.page316;

public class Market {
    private int fishCount;
    private boolean fishHasAdded = false;

    public synchronized void addFishToMarket(int fishCount) {
        while (fishHasAdded){
            try {
                System.out.println("- Перед wait в addFishToMarket");
                Thread.sleep(3000);
                wait();
                System.out.println("- После wait в addFishToMarket");
            }
            catch (InterruptedException e) {
                System.out.println("Поток захотели прервать во время wait");
            }
        }
        this.fishCount = fishCount;
        fishHasAdded = true;
        System.out.println("В магазин еще добавили рыбы: " + this.fishCount);
        notify();
    }

    public synchronized void getFishFromMarket() {
        while (!fishHasAdded){
            try {
                System.out.println("- Перед wait в getFishFromMarket");
                Thread.sleep(3000);
                wait();
                System.out.println("- После wait в getFishFromMarket");
            } catch (InterruptedException e) {
                System.out.println("Поток захотели прервать во время wait");
            }
        }
        fishHasAdded = false;
        System.out.println("Из магазина взяли рыбу: " + fishCount);
        notify();
    }
}
