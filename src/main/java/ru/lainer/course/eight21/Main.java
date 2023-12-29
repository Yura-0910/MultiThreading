package ru.lainer.course.eight21;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(new RunnableImpl());
        Thread secondThread = new Thread(new RunnableImpl());

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println("Колличество = " + Counter.getCount());
    }
}
