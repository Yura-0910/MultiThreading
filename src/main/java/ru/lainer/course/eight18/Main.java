package ru.lainer.course.eight18;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore telefonnayButka = new Semaphore(2);
        Person personOne = new Person("Ivan1", telefonnayButka);
        Person personTwo = new Person("Ivan2", telefonnayButka);
        Person personThree = new Person("Ivan3", telefonnayButka);
        Person personFour = new Person("Ivan4", telefonnayButka);
        Person personFive = new Person("Ivan5", telefonnayButka);

        personOne.start();
        personTwo.start();
        personThree.start();
        personFour.start();
        personFive.start();
    }
}
