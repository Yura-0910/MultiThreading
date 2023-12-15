package ru.lainer.course.eight11.ex2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Ivan", lock);
        new Employee("Ivan2", lock);
        new Employee("Ivan3", lock);
    }
}
