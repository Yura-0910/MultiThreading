package ru.lainer.course.eight11.ex1;

import ru.lainer.course.eight11.ex1.MobileCall;

public class RunnableForMobile implements Runnable{
    private final MobileCall mobile;

    public RunnableForMobile(MobileCall mobile) {
        this.mobile = mobile;
    }

    @Override
    public void run() {
        mobile.mobileCall();
    }
}
