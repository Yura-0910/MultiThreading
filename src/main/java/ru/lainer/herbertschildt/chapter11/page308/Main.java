package ru.lainer.herbertschildt.chapter11.page308;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начал работу");
        Thread thread = new Thread(new UsualClass());
        thread.start();
        System.out.println("Поток = " +  thread.getName() + " выполняется ? :: " + thread.isAlive());
        thread.join();
        System.out.println("Поток = " +  thread.getName() + " выполняется ? :: " + thread.isAlive());
        System.out.println("Поток main завершил работу");
    }
}
