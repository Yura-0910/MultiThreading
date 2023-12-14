package ru.lainer.course.eight10;

public class Main {
    public static void main(String[] args) {
        Object firstLock = new Object();
        Object secondLock = new Object();
        FirstThread firstThread = new FirstThread(firstLock,secondLock);
        SecondThread secondThread = new SecondThread(firstLock,secondLock);
        firstThread.start();
        secondThread.start();
    }
}
