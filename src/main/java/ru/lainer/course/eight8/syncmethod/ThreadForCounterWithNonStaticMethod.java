package ru.lainer.course.eight8.syncmethod;

public class ThreadForCounterWithNonStaticMethod implements Runnable{
    private final CounterWithNonStaticMethod counter;

    public ThreadForCounterWithNonStaticMethod(CounterWithNonStaticMethod counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            counter.countPlusPlus();
        }
    }
}
