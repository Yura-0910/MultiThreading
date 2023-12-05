package ru.lainer.course.eight8.threemethods;

public class RunnableForSkype implements Runnable{
    private final Object lock;

    public RunnableForSkype(Object lock) {
        this.lock = lock;
    }

    private void skype(){
        synchronized(lock){
            System.out.println(this);
            System.out.println("Начал звонок по Skype");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Завершил звонок по Skype");
        }
    }
    @Override
    public void run() {
        skype();
    }
}
