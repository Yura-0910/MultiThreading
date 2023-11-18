package ru.lainer.course.eight3;

public class StudyThreadMethods extends Thread{
    @Override
    public void run() {
        System.out.println("Метод run выполняется в потоке = " +Thread.currentThread().getName());
    }
}
