package ru.lainer.course.eight17;

import java.util.concurrent.Callable;

public class FactorialWithCallable implements Callable<Integer> {
    private final int factorialOfNumber;
    private int factorialResult = 1;

    public FactorialWithCallable(int factorialOfNumber) {
        this.factorialOfNumber = factorialOfNumber;
    }

    public int getFactorialResult() {
        return factorialResult;
    }

    @Override
    public Integer call() throws Exception {
        if(factorialOfNumber <=0 ){
            throw new Exception("Вы ввели неправильное число");
        }
        else {
            for (int i = 1; i <= factorialOfNumber; i++) {
                factorialResult = factorialResult * i;
                Thread.sleep(1000);
            }
        }
        return factorialResult;
    }
}
