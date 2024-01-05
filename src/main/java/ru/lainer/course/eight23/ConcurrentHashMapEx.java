package ru.lainer.course.eight23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        //HashMap<Integer, String> hashMap = new HashMap<>();
        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, "Ivan1");
        hashMap.put(2, "Ivan2");
        hashMap.put(3, "Ivan3");
        hashMap.put(4, "Ivan4");
        hashMap.put(5, "Ivan5");
        System.out.println(hashMap);

        Runnable runnableFirst = () -> {
            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer keyFromHashMap = iterator.next();
                System.out.println(keyFromHashMap + " : " + hashMap.get(keyFromHashMap));
            }
        };

        Runnable runnableSecond = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hashMap.put(6, "IvanFromSecondRunnable");
        };

        Thread threadFirst = new Thread(runnableFirst);
        Thread threadSecond = new Thread(runnableSecond);
        threadFirst.start();
        threadSecond.start();
        threadFirst.join();
        threadSecond.join();
        System.out.println(hashMap);
    }
}
