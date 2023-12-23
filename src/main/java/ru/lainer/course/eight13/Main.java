package ru.lainer.course.eight13;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начался поток main");
        Interruption threadOne = new Interruption();
        threadOne.start();
        threadOne.interrupt();
        threadOne.join();
        System.out.println("Завершился поток main");
    }
}
