package ru.lainer.course.eight10;

public class SecondThread extends Thread{
    private final Object firstLock;
    private final Object secondLock;

    public SecondThread(Object firstLock, Object secondLock) {
        this.firstLock = firstLock;
        this.secondLock = secondLock;
    }

    @Override
    public void run() {
        System.out.println("SecondThread: попытка захватить монитор secondLock");
        synchronized (secondLock){
            System.out.println("SecondThread: захватили монитор secondLock");
            System.out.println("SecondThread: попытка захватить монитор firstLock");
            synchronized (firstLock){
                System.out.println("SecondThread: захватили монитор firstLock и secondLock");
            }
        }
    }
}
