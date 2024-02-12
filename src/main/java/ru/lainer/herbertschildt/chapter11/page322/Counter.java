package ru.lainer.herbertschildt.chapter11.page322;

public class Counter {
    private int counter;
    private boolean pause = false;
    public synchronized int getCounter() {
        return counter;
    }

    public synchronized void increaseCounter(){
        ++counter;
    }

    public synchronized boolean isPause() {
        return pause;
    }

    public synchronized void suspendThread(){
        pause = true;
    }

    public synchronized void reactivateThread(){
        pause = false;
        notify();
    }
}
