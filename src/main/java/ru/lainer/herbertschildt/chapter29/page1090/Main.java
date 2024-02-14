package ru.lainer.herbertschildt.chapter29.page1090;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new AfterReachingBarrier());
        new Thread(new JupiterThread("A", cyclicBarrier)).start();
        new Thread(new JupiterThread("B", cyclicBarrier)).start();
        new Thread(new JupiterThread("C", cyclicBarrier)).start();
    }
}
