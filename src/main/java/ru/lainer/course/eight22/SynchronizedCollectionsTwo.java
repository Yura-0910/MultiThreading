package ru.lainer.course.eight22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionsTwo {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> notSynchronizedList = new ArrayList<Integer>();
        for (int i = 0; i < 15000; i++) {
            notSynchronizedList.add(i);
        }

        List<Integer> synchronizedList = Collections.synchronizedList(notSynchronizedList);

        Runnable firstRunnableWithLambda = () -> {
            synchronized (synchronizedList) {
                Iterator<Integer> iterator = synchronizedList.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable secondRunnableWithLambda = () -> synchronizedList.remove(5);

        Thread firstThread = new Thread(firstRunnableWithLambda);
        Thread secondThread = new Thread(secondRunnableWithLambda);

        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();

        System.out.println(synchronizedList);
    }
}
