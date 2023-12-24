package ru.lainer.course.eight14;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток = " + Thread.currentThread().getName() + " работает");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
