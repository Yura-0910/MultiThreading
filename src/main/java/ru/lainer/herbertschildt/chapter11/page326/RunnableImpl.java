package ru.lainer.herbertschildt.chapter11.page326;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток что-то делает");
    }
}
