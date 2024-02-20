package ru.lainer.herbertschildt.chapter29.page1095.ex2;

import java.util.concurrent.Phaser;

public class FirstParties implements Runnable{
    private SharedCode sharedCode;

    public FirstParties(SharedCode sharedCode) {
        this.sharedCode = sharedCode;
    }

    @Override
    public void run() {
        sharedCode.takeFromHere();
    }
}
