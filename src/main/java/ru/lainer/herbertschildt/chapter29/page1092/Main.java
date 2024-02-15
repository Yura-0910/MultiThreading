package ru.lainer.herbertschildt.chapter29.page1092;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(new MakeString(exchanger)).start();
        new Thread(new UseString(exchanger)).start();
    }
}
