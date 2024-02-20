package ru.lainer.herbertschildt.chapter29.page1095.ex1;

import java.util.concurrent.Phaser;

/*
  ex1 - это пример с конструктором вида "new Phaser(1)"
  Здесь потоки не надо регестрировать
  И метод arriveAndDeregister()
 */
public class Main {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(4);
        new Thread(new PartiesForThreads("A", phaser)).start();
        new Thread(new PartiesForThreads("B", phaser)).start();
        new Thread(new PartiesForThreads("C", phaser)).start();
        new Thread(new DeregisterForThreads("D", phaser)).start();
    }
}
