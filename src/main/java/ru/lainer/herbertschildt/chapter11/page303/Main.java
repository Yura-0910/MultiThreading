package ru.lainer.herbertschildt.chapter11.page303;

public class Main {
    public static void main(String[] args) {
        //Первый способ создания потока
        Thread thread = new Thread(new SimpleClass());
        thread.start();
    }
}
