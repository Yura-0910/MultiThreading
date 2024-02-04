package ru.lainer.briangoetz.glava2;

public class Main {
    public static void main(String[] args) {
        Compass compass = new Compass();
        ThreadFirst threadFirst = new ThreadFirst(compass);
        ThreadSecond threadSecond = new ThreadSecond(compass);
        threadFirst.start();
        threadSecond.start();
    }
}
