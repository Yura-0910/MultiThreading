package ru.lainer.course.eight2;

public class SecondWayOfThreadCreation implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток: второй способ создания");
    }
}
