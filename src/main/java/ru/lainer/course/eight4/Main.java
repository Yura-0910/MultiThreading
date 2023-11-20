package ru.lainer.course.eight4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StudyThreadMethods firstThread = new StudyThreadMethods();
        System.out.println("Текущее состояние потока (после создания) = " + firstThread.getState());
        firstThread.start();
        System.out.println("Текущее состояние потока (после запуска) = " + firstThread.getState());
        firstThread.join();
        System.out.println("Текущее состояние потока (после окончания )= " + firstThread.getState());
        System.out.println("Продолжил работать поток = " + Thread.currentThread().getName());
    }
}
