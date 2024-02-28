package ru.lainer.joshuabloch.article66.ex2;

import java.util.concurrent.TimeUnit;

public class WhileTrue extends Thread{
    private boolean b = true;
    @Override
    public void run() {
        byte i = 0;
        try {
            while (b) {
                i++;
                //Если закоментировать эту строку, то while работает бесконечно.
                System.out.println(i); //int i = 16438, byte i = 40
            }
            System.out.println("i after while = " + i);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WhileTrue thread = new WhileTrue();
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.b = false;
        thread.join();
        System.out.println("Main thread ended");
    }
}
