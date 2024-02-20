package ru.lainer.herbertschildt.chapter29.page1095.ex4;

public class PartiesForThreads implements Runnable{
    private CustomPhaser customPhaser;
    private String threadName;

    public PartiesForThreads(CustomPhaser customPhaser, String threadName) {
        this.customPhaser = customPhaser;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        //Ожидаем завершения заданного колличества стадий = 5
        while (!customPhaser.isTerminated()){
            System.out.println("Поток " + threadName + " начал стадию № " + (customPhaser.getPhase()+1));
            customPhaser.arriveAndAwaitAdvance();
        }
    }
}
