package ru.lainer.course.eight7.datarace;

public class WorkingWithCounter implements Runnable{
    public void increaseCounter(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    @Override
    public void run() {
        for(int i = 0;i< 3; i++){
            increaseCounter();
        }
    }
}
