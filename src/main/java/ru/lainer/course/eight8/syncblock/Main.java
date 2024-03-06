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

        ThreadForCounterWithNonStaticMethod runnableImpl = new ThreadForCounterWithNonStaticMethod();
        Thread threadFour = new Thread(runnableImpl);
        Thread threadFive = new Thread(runnableImpl);
        Thread threadSix = new Thread(runnableImpl);
        threadFour.start();
        threadFive.start();
        threadSix.start();

        threadFour.join();
        threadFive.join();
        threadSix.join();

        System.out.println();


    }
}
