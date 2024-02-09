package ru.lainer.herbertschildt.chapter11.page314;

public class ThreadFirst implements Runnable{
    private final NotSynchronizedClass notSynchronizedClass;

    public ThreadFirst(NotSynchronizedClass notSynchronizedClass) {
        this.notSynchronizedClass = notSynchronizedClass;
    }

    @Override
    public void run() {
        synchronized (notSynchronizedClass){
            for (int i = 0; i < 300; i++) {
                notSynchronizedClass.FirstNotSynchronizedMethod();
            }
        }
    }
}
