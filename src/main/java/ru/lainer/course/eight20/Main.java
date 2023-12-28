package ru.lainer.course.eight20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> firstFriendAction = new ArrayList<>();
        firstFriendAction.add(Action.NOJNICY);
        firstFriendAction.add(Action.BUMAGA);
        firstFriendAction.add(Action.NOJNICY);

        List<Action> secondFriendAction = new ArrayList<>();
        secondFriendAction.add(Action.BUMAGA);
        secondFriendAction.add(Action.KAMEN);
        secondFriendAction.add(Action.KAMEN);

        BestFriend firstFriend = new BestFriend("Ivan", firstFriendAction, exchanger);
        BestFriend secondFriend = new BestFriend("Petr", secondFriendAction, exchanger);

        firstFriend.start();
        secondFriend.start();
    }
}
