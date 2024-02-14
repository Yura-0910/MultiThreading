package ru.lainer.herbertschildt.chapter29.page1090;

public class AfterReachingBarrier implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток AfterReachingBarrier запустился:: после достижения всеми барьера");
    }
}
