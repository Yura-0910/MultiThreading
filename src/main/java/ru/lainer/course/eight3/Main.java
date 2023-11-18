package ru.lainer.course.eight3;

public class Main {
    public static void main(String[] args){
        StudyThreadMethods onlyCreateThread = new StudyThreadMethods();
        System.out.println("Имя потока onlyCreateThread = " + onlyCreateThread.getName());
        System.out.println("Приоритет потока onlyCreateThread = " + onlyCreateThread.getPriority());

        onlyCreateThread.setName("nameOfThread");
        onlyCreateThread.setPriority(9);
        onlyCreateThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Имя потока onlyCreateThread = " + onlyCreateThread.getName());
        System.out.println("Приоритет потока onlyCreateThread = " + onlyCreateThread.getPriority());

        System.out.println("Имя потока с main методом = " + Thread.currentThread().getName());

        onlyCreateThread.start();
    }
}
