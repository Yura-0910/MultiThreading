package ru.lainer.course.eight25;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(4);
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        System.out.println(queue);
    }
}
