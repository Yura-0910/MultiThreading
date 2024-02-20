package ru.lainer.herbertschildt.chapter29.page1095.ex4;

import java.util.concurrent.Phaser;

public class CustomPhaser extends Phaser {
    private int customPhase;
    /*
     - Здесь мы руками задаем parties, поэтому можно не регестририоваться потокам в Phaser
     - customPhase(стадии) должны быть не меньше 1
     */
    public CustomPhaser(int parties, int customPhase) {
        super(parties);
        this.customPhase = customPhase - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        boolean complete = false;
        System.out.println("Стадия  = " + (phase + 1) + " : завершена");
        if (phase == customPhase || registeredParties == 0){
            complete = true;
        }
        return complete;
    }
}
