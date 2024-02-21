package ru.lainer.herbertschildt.chapter29.page1110;

public class SecondRunnable implements Runnable{
    private Shared sharedCode;

    public SecondRunnable(Shared sharedCode) {
        this.sharedCode = sharedCode;
    }

    @Override
    public void run() {
        sharedCode.runTask();
    }
}
