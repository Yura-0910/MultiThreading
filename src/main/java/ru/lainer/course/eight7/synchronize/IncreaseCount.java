package ru.lainer.course.eight7.synchronize;

public class IncreaseCount implements Runnable{
    public static  int count;
    public synchronized void increaseCount(){
        count++;
    }
    @Override
    public void run() {
        for(int i = 0;i< 1000; i++){
            increaseCount();
        }
    }
}
