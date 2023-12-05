package ru.lainer.course.eight8.syncmethod;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new ThreadForCounterWithStaticMethod());
        Thread threadTwo = new Thread(new ThreadForCounterWithStaticMethod());
        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("");

        CounterWithNonStaticMethod counter = new CounterWithNonStaticMethod();
        ThreadForCounterWithNonStaticMethod runnableImpl = new ThreadForCounterWithNonStaticMethod(counter);
        Thread threadThree = new Thread(runnableImpl);
        Thread threadFour = new Thread(runnableImpl);
        threadThree.start();
        threadFour.start();
    }
}
