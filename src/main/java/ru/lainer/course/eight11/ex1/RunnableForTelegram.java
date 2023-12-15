package ru.lainer.course.eight11.ex1;

public class RunnableForTelegram implements Runnable{
    private TelegramCall telegram;

    public RunnableForTelegram(TelegramCall telegram) {
        this.telegram = telegram;
    }

    @Override
    public void run() {
        telegram.telegramCall();
    }
}
