package ru.lainer.course.eight2;

public class FirstWayOfThreadCreation extends Thread{
    @Override
    public void run() {
        System.out.println("Поток 1");
    }
}

class AnotherOneThread extends Thread{
    @Override
    public void run() {
        System.out.println("Поток 2");
    }
}
