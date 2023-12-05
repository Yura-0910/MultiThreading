package ru.lainer.course.eight8.syncblock;

public class CounterWithNonStaticMethod {
    public static volatile int count;

    public void atSameTimeAccess(){
        System.out.println("Все потоки:: одновременно выполняют эту функцию");
    }

    public void countPlusPlus(){
        //atSameTimeAccess();
        synchronized (this){
            count++;
            System.out.print(count + " || ");
        }
    }
}
