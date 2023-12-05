package ru.lainer.course.eight8.syncmethod;

public class CounterWithStaticMethod {
    public static volatile int count;

    public static synchronized void countPlusPlus(){
        count++;
        System.out.print(count + " . ");
    }
}
