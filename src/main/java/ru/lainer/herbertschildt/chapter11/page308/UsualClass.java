package ru.lainer.herbertschildt.chapter11.page308;

public class UsualClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток " + Thread.currentThread().getName() + " начал работу");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Поток попытались прервать во время сна");
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " завершил работу");
    }
}
