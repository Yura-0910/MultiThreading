package ru.lainer.course.eight8.syncblock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new ThreadForCounterWithStaticMethod());
        Thread threadTwo = new Thread(new ThreadForCounterWithStaticMethod());
        Thread threadThree = new Thread(new ThreadForCounterWithStaticMethod());
        threadOne.start();
        threadTwo.start();
        threadThree.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();

        System.out.println();

        Thread threadFour = new Thread(new ThreadForCounterWithNonStaticMethod());
        Thread threadFive = new Thread(new ThreadForCounterWithNonStaticMethod());
        Thread threadSix = new Thread(new ThreadForCounterWithNonStaticMethod());
        threadFour.start();
        threadFive.start();
        threadSix.start();

        threadFour.join();
        threadFive.join();
        threadSix.join();

        System.out.println();


    }
}
