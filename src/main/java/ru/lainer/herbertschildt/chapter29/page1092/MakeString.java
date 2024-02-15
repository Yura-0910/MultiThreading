package ru.lainer.herbertschildt.chapter29.page1092;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable{
    private final Exchanger<String> exchanger;
    private String result;
    Character character;

    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        result = "";
        character = 'A';
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            String send = new String();
            try {
                for (int j = 0; j < 5; j++) {
                    send = send + character++;
                }
                result = exchanger.exchange(send);
                System.out.println("Из потока UseString получили : " + result);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
