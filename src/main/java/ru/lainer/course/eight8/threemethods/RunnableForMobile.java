package ru.lainer.course.eight8.threemethods;

public class RunnableForMobile implements Runnable{
    private final Object lock;

    public RunnableForMobile(Object lock) {
        this.lock = lock;
    }

    private void mobile(){
        synchronized(lock) {
            System.out.println(this);
            System.out.println("Начал звонок по телефону");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Завершил звонок по телефону");
        }
    }
    @Override
    public void run() {
        mobile();
    }
}
