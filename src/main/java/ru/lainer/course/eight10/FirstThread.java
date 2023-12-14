package ru.lainer.course.eight10;

public class FirstThread extends Thread{
    private final Object firstLock;
    private final Object secondLock;

    public FirstThread(Object firstLock, Object secondLock) {
        this.firstLock = firstLock;
        this.secondLock = secondLock;
    }

    @Override
    public void run() {
        System.out.println("FirstThread: попытка захватить монитор firstLock");
        synchronized (firstLock){
            System.out.println("FirstThread: захватили монитор firstLock");
            System.out.println("FirstThread: попытка захватить монитор secondLock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (secondLock){
                System.out.println("FirstThread: захватили монитор firstLock и secondLock");
            }
        }
    }
}
