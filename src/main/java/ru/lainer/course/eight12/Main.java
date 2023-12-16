package ru.lainer.course.eight12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начался поток main");

        UserThread userThread = new UserThread();
        userThread.setName("it_is_user_thread");

        DemonThread demonThread = new DemonThread();
        demonThread.setName("it_is_demon_thread");
        demonThread.setDaemon(true);

        userThread.start();
        demonThread.start();

        System.out.println("Завершился поток main");
    }
}
