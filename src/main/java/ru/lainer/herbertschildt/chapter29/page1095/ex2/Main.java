package ru.lainer.herbertschildt.chapter29.page1095.ex2;

import java.util.concurrent.Phaser;

/*
  ex2 - это пример с конструктором вида "new Phaser()"
  Здесь потоки надо регестрировать, чтоб знать сколько потоков ожидать у барьера
 */
public class Main {
    public static void main(String[] args) {
        System.out.println ("Начало main - потока");

        Phaser phaser = new Phaser();
        SharedCode firstSharedCode = new SharedCode("A", phaser);
        SharedCode secondSharedCode = new SharedCode("B", phaser);
        SharedCode thirdSharedCode = new SharedCode("C", phaser);
        SharedCode fourthSharedCode = new SharedCode("D", phaser);

        new Thread(new FirstParties(firstSharedCode)).start();
        new Thread(new FirstParties(secondSharedCode)).start();
        new Thread(new SecondParties(thirdSharedCode)).start();
        new Thread(new SecondParties(fourthSharedCode)).start();
        new Thread(new ThirdParties("E", phaser)).start();
    }
}
