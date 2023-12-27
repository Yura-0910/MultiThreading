package ru.lainer.course.eight18;

import java.util.concurrent.Semaphore;

public class Person extends Thread{
    private String name;
    private Semaphore telefonnayButka;

    public Person(String name, Semaphore telefonnayButka) {
        this.name = name;
        this.telefonnayButka = telefonnayButka;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет");
            telefonnayButka.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            telefonnayButka.release();
        }
    }
}
