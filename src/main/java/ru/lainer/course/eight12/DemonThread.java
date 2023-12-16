package ru.lainer.course.eight12;

public class DemonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " это демон ? " +
                           Thread.currentThread().isDaemon());
        for (int i = 0; i < 5000; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
