package school.lemon.changerequest.java.generics.Generator;

import java.util.Random;

public class IntegerGenerator extends NumberGenerator<Integer> {

    @Override
    public Integer[] generateNumbers() {
        Integer[] arrayInt = new Integer[DEFAULT_SIZE_TEN];
        for (int i = 0; i < DEFAULT_SIZE_TEN; i++) {
            arrayInt[i] = new Random().nextInt();
        }
        return arrayInt;
    }

    @Override
    public IntegerSumCalculator getSumCalculator() {
        return new IntegerSumCalculator();
    }
}
