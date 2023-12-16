package ru.lainer.course.eight12;

public class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " это демон ? " +
                           Thread.currentThread().isDaemon());
        for (char i = 'A'; i <= 'M'; i++) {
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
