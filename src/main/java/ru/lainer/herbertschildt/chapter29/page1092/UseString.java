package ru.lainer.herbertschildt.chapter29.page1092;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable{
    private final Exchanger<String> exchanger;
    private String send;
    private String result;

    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.send = "";
        this.result = "";
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                send = send + i;
                result = exchanger.exchange(send);
                System.out.println("Из потока MakeString получили : " + result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
