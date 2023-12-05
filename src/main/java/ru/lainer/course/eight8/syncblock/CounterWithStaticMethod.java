package ru.lainer.course.eight8.syncblock;

public class CounterWithStaticMethod {
    public static volatile int count;
    public static void countPlusPlus(){
        synchronized(CounterWithStaticMethod.class){
            count++;
            System.out.print(count + " | ");
        }
    }
}
