package ru.lainer.herbertschildt.chapter11.page303;

public class SimpleClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток тут что-то делает");
    }
}
