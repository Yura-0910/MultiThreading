package ru.lainer.herbertschildt.chapter11.page322;

public class Mountains implements Runnable{
    private final Counter counter;

    public Mountains(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Поток " + Thread.currentThread().getName() + " начал работу");
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + " = " + counter.getCounter());
                counter.increaseCounter();
                synchronized (counter){
                    while(counter.isPause()){
                        try {
                            System.out.println("Перед wait");
                            counter.wait();
                            System.out.println("После wait");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
