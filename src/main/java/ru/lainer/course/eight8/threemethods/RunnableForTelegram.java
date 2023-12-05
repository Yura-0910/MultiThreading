package ru.lainer.course.eight8.threemethods;

public class RunnableForTelegram implements Runnable{
    private final Object lock;

    public RunnableForTelegram(Object lock) {
        this.lock = lock;
    }

    private void telegram(){
        synchronized(lock){
            System.out.println(this);
            System.out.println("Начал звонок по telegram");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Завершил звонок по telegram");
        }
    }
    @Override
    public void run() {
        telegram();
    }
}
