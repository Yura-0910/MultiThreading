package ru.lainer.course.eight4;

public class StudyThreadMethods extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Начал работать поток  = " + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("Продолжает работать поток = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
