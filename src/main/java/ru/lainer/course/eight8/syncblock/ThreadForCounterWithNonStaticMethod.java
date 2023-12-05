package ru.lainer.course.eight8.syncblock;

public class ThreadForCounterWithNonStaticMethod implements Runnable{
    public static CounterWithNonStaticMethod counter;

    public ThreadForCounterWithNonStaticMethod() {
        counter = new CounterWithNonStaticMethod();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            counter.countPlusPlus();
        }
    }
}
