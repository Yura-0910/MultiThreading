package ru.lainer.course.eight11.trylock;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread{
    private final String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()){
            try {
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
        /*Далее код, который будет выполняться, если замок не удалось поставить,
        т.е. когда замок уже занят*/
        else {
            System.out.println(name + " Замок уже кто-то поставил");
        }
    }
}
