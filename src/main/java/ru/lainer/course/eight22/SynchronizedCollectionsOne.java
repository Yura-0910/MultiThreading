package ru.lainer.course.eight22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionsOne {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        //Это не синхронизированный ArrayList
        //ArrayList<Integer> target = new ArrayList<>();

        //Синхронизированный ArrayList
        List<Integer> target = Collections.synchronizedList(new ArrayList<>());

        /*
        Здесь реализовали метод run() из функционального интерфейса Runnable
        с использованием лямбда выражения.
         */
        Runnable runnable = () -> {target.addAll(source);};

        Thread firstThread = new Thread(runnable);
        Thread secondThread = new Thread(runnable);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
        System.out.println(target);
    }
}
