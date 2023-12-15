package ru.lainer.course.eight11.ex2;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread{
    private final String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        //При срабатывании этого конструктора, запускаем поток через start()
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет");
            lock.lock();
            System.out.println(name + " начал использовать банкомат");
            Thread.sleep(2000);
            System.out.println(name + " завершил работу с банкоматом");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
