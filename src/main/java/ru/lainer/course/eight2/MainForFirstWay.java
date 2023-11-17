package ru.lainer.course.eight2;

import ru.lainer.course.eight2.AnotherOneThread;
import ru.lainer.course.eight2.FirstWayOfThreadCreation;

public class MainForFirstWay {
    public static void main(String[] args){
        FirstWayOfThreadCreation firstThread = new FirstWayOfThreadCreation();
        AnotherOneThread secondThread = new AnotherOneThread();
        firstThread.start();
        secondThread.start();
    }
}
