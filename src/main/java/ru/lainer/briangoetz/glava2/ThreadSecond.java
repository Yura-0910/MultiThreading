package ru.lainer.briangoetz.glava2;

public class ThreadSecond extends Thread{
    private final Compass compass;

    public ThreadSecond(Compass compass) {
        this.compass = compass;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                compass.toSouth();
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException при работе toSouth");
        }
    }
}
