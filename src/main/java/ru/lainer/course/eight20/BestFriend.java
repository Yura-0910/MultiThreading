package ru.lainer.course.eight20;

import java.util.List;
import java.util.concurrent.Exchanger;

public class BestFriend extends Thread{
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
    }

    //Когда я буду выигровать
    public void whoWin(Action myActon, Action friendAction){
        if ((myActon == Action.KAMEN && friendAction == Action.NOJNICY) ||
            (myActon == Action.NOJNICY && friendAction == Action.BUMAGA)||
            (myActon == Action.BUMAGA && friendAction == Action.KAMEN)){
            System.out.println(name + " Выйграл");
        }
    }
    @Override
    public void run() {
        Action otvetDruga;
        /*Для всего листа List<Action> myAction будем делать так:
        т.е. в цикле, наш поток отправляет в другой поток, то что он показывает
        отправляет там бумагу, потом еще бумагу, потом ножницы.
        И для каждого случая отправки действия (бумага, бумага, ножницы)
        мы получаем ответ: что в ответ на наше действия показал второй поток
        */
        for (Action action: myAction){
            try {
                otvetDruga = exchanger.exchange(action);
                whoWin(action, otvetDruga);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
