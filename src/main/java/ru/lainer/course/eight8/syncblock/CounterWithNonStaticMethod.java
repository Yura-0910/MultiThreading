package ru.lainer.course.eight8.syncblock;

public class CounterWithNonStaticMethod {
    public static volatile int count;

    public void countPlusPlus(){
        synchronized (this){
            count++;
            System.out.print(count + " || ");
        }
    }
}
