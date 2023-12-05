package ru.lainer.course.eight8.syncmethod;

public class CounterWithNonStaticMethod {
    public static volatile int count;

    public synchronized void countPlusPlus(){
        count++;
        System.out.print(count + " | ");
    }
}
