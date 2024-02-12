package ru.lainer.herbertschildt.chapter11.page322;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Mountains mountains = new Mountains(counter);
        SuspendAndReactivate suspendAndReactivateRunnable = new SuspendAndReactivate(counter);

        Thread journeyTo = new Thread(mountains);
        Thread suspendAndReactivate = new Thread(suspendAndReactivateRunnable);

        journeyTo.setName("Everest");
        suspendAndReactivate.setName("SuspendAndReactivate");

        journeyTo.start();
        suspendAndReactivate.start();

        journeyTo.join();
        suspendAndReactivate.join();

        System.out.println("main поток завершился");
    }
}
