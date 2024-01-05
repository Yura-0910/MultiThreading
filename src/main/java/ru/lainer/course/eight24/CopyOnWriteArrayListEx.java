package ru.lainer.course.eight24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        //ArrayList<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Ivan1");
        list.add("Ivan2");
        list.add("Ivan3");
        list.add("Ivan4");
        list.add("Ivan5");
        System.out.println(list);

        Runnable runnableFirst = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnableSecond = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(4);
            list.add("NewElementFromSecondRunnable");
        };

        Thread firstThread = new Thread(runnableFirst);
        Thread secondThread = new Thread(runnableSecond);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
        System.out.println(list);
    }
}
