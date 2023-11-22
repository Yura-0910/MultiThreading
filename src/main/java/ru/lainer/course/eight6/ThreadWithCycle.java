package ru.lainer.course.eight6;

public class ThreadWithCycle extends Thread{
    volatile boolean cycleEndFlag = true;
    @Override
    public void run() {
        long counter = 0;

        System.out.println("Начал работать поток ThreadWithCycle");
        while (cycleEndFlag){
            counter++;
        }
        System.out.println("Закончил работать поток ThreadWithCycle. counter = " + counter);
    }

    public void setCycleEndFlag(boolean cycleEndFlag) {
        this.cycleEndFlag = cycleEndFlag;
    }
}
