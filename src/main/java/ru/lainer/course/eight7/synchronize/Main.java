package ru.lainer.course.eight7.synchronize;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new IncreaseCount());
        Thread threadTwo = new Thread(new IncreaseCount());
        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("count (должно быть 2000) = " + IncreaseCount.count);
    }
}
