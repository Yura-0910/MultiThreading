package ru.lainer.briangoetz.glava2;

public class ThreadFirst extends Thread{
    private final Compass compass;

    public ThreadFirst(Compass compass) {
        this.compass = compass;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                compass.toNorth();
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException при работе toNorth");
        }
    }
}
