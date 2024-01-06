package ru.lainer.course.eight25;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
            int dobavil = 0;
            while (true){
                try {
                    arrayBlockingQueue.put(++dobavil);
                    System.out.println("Producer добавил: " + dobavil + " " + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //Consumer
        new Thread(() -> {
            while (true){
                try {
                    Integer poluchil = arrayBlockingQueue.take();
                    System.out.println("Consumer прочитал: " + poluchil + " " + arrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
