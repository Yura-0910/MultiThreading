package ru.lainer.course.eight15;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток = " + Thread.currentThread().getName() + " работает");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток = " + Thread.currentThread().getName() + " отработал");
    }
}
