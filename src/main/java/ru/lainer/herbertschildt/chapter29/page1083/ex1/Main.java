package ru.lainer.herbertschildt.chapter29.page1083.ex1;

import ru.lainer.herbertschildt.chapter29.page1083.ex1.DecThread;
import ru.lainer.herbertschildt.chapter29.page1083.ex1.IncThread;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new IncThread("A", semaphore)).start();
        new Thread(new DecThread("B", semaphore)).start();
    }
}
