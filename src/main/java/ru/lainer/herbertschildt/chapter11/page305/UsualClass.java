package ru.lainer.herbertschildt.chapter11.page305;

public class UsualClass extends Thread{
    @Override
    public void run() {
        System.out.println("Поток что-то делает");
    }
}
