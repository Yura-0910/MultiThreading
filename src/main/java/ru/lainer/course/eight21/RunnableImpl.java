package ru.lainer.course.eight21;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Counter.increment();
        }
    }
}
