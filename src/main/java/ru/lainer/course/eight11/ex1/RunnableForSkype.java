package ru.lainer.course.eight11.ex1;

public class RunnableForSkype implements Runnable{
    private final SkypeCall skype;

    public RunnableForSkype(SkypeCall skype) {
        this.skype = skype;
    }

    @Override
    public void run() {
        skype.skypeCall();
    }
}
