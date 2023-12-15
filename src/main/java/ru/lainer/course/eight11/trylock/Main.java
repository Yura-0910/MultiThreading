package ru.lainer.course.eight11.trylock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Name1", lock);
        new Employee("Name2", lock);
        Thread.sleep(5000);
        new Employee("Name3", lock);
        new Employee("Name4", lock);

    }
}
