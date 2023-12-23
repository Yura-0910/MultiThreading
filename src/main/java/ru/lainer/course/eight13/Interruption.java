package ru.lainer.course.eight13;

public class Interruption extends Thread{
    @Override
    public void run() {
        double sqrtSum = 0;
        for (int i = 0; i < 10000000; i++) {
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна. Завершаемся");
                return;
            }
            if(isInterrupted()){
                System.out.println("Поток " + Thread.currentThread().getName() +
                                   " хочет прервать другой поток");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
