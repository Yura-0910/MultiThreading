package ru.lainer.herbertschildt.chapter29.page1110;

public class FirstRunnable implements Runnable{
    private Shared sharedCode;

    public FirstRunnable(Shared sharedCode) {
        this.sharedCode = sharedCode;
    }

    @Override
    public void run() {
        sharedCode.runTask();
    }
}
