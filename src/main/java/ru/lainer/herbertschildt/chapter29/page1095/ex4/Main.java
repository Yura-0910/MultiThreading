package ru.lainer.herbertschildt.chapter29.page1095.ex4;

/*
  ex4 - это пример, где мы @Override метод onAdvance из Phaser
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Начало main-thread");

        CustomPhaser customPhaser = new CustomPhaser(4,5);
        new Thread(new PartiesForThreads(customPhaser, "A")).start();
        new Thread(new PartiesForThreads(customPhaser, "B")).start();
        new Thread(new PartiesForThreads(customPhaser, "C")).start();

        //Ожидаем завершения заданного колличества стадий = 5
        while (!customPhaser.isTerminated()){
            System.out.println("Поток " + Thread.currentThread().getName() +
                               " начал стадию № " + (customPhaser.getPhase()+1));
            customPhaser.arriveAndAwaitAdvance();
        }

        System.out.println("Объект Phaser закончил работу.");
    }
}
