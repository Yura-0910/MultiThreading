package ru.lainer.joshuabloch.article66.ex1;

public class StopThread {
    private static boolean stopRequested = true;

    public synchronized static boolean isStopRequested() {
        return stopRequested;
    }

    public synchronized static void setStopRequested(boolean stopRequested) {
        StopThread.stopRequested = stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (StopThread.isStopRequested()) {
                    i++;
                    //Если закоментировать эту строку + БЕЗ synchronized у двух методов,
                    // то while работает бесконечно.
                    //System.out.println(i); //int i = 16438, byte i = 40
                }
                System.out.println("i after while = " + i);
            }
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println(StopThread.isStopRequested());
        StopThread.setStopRequested(false);
        System.out.println(StopThread.isStopRequested());
    }
}
