package school.lemon.changerequest.java.generics.Generator;

import java.util.Random;

public class DoubleGenerator extends NumberGenerator<Double> {


    @Override
    public Double[] generateNumbers() {
        Double[] arrayDouble = new Double[DEFAULT_SIZE_TEN];
        for (int i = 0; i < DEFAULT_SIZE_TEN; i++) {
            arrayDouble[i] = new Random().nextDouble();
        }
        return arrayDouble;
    }

    @Override
    public DoubleSumCalculator getSumCalculator() {
        return new DoubleSumCalculator();
    }

}
