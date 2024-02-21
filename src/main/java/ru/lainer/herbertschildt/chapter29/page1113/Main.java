package ru.lainer.herbertschildt.chapter29.page1113;

public class Main {
    public static void main(String[] args) {
        new Thread(new SharedRunnable("A")).start();
        new Thread(new SharedRunnable("B")).start();
        new Thread(new SharedRunnable("C")).start();
    }
}
