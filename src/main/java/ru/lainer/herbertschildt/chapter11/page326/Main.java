package ru.lainer.herbertschildt.chapter11.page326;

public class Main {
    public static Thread createThread(){
        Thread thread = new Thread(new RunnableImpl());
        thread.start();
        return thread;
    }
    public static void main(String[] args) {
        Main.createThread();
    }
}
