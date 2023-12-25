package ru.lainer.course.eight16;

public class Factorial implements Runnable{
    private final int factorialOfNumber;
    private int factorialResult = 1;

    public Factorial(int factorialOfNumber) {
        this.factorialOfNumber = factorialOfNumber;
    }

    public int getFactorialResult() {
        return factorialResult;
    }

    @Override
    public void run() {
        if(factorialOfNumber <=0 ){
            System.out.println("Вы ввели неправильное число");
            return;
        }
        else {
            for (int i = 1; i <= factorialOfNumber; i++) {
                factorialResult = factorialResult * i;
            }
        }
    }
}
