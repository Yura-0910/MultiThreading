package ru.lainer.course.eight2;

public class MainForSecondWay {
    public static void main(String[] args){
        Thread firstThread = new Thread(new SecondWayOfThreadCreation());
        firstThread.start();

        Thread secondThread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Еще поток: второй способ создания");
            }
        });
        secondThread.start();

        new Thread(() -> System.out.println("Еще один поток")).start();
    }
}
