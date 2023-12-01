package ru.lainer.course.eight7.datarace;

public class Main {
    public static void main(String[] args) {
        WorkingWithCounter workWithCounter = new WorkingWithCounter();
        Thread threadOne = new Thread(workWithCounter);
        Thread threadTwo = new Thread(workWithCounter);
        Thread threadThree = new Thread(workWithCounter);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
