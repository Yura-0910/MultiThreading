package ru.lainer.course.eight8.syncblock;

public class ThreadForCounterWithStaticMethod implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            CounterWithStaticMethod.countPlusPlus();
        }
    }
}
