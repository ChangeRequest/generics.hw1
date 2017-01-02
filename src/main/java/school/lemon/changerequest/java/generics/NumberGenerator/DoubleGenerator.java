package school.lemon.changerequest.java.generics.NumberGenerator;

import java.util.Random;

/**
 * Created by lera on 27.12.16.
 */
public class DoubleGenerator extends NumberGeneratorImp<Double> {

    @Override
    public <Double extends Number> Double[] generateNumbers() {
        java.lang.Double[] newArray = new java.lang.Double[10];
        for (int i = 0; i < 10; i++) {
            Random randNumber = new Random();
            newArray[i] = randNumber.nextDouble();
        }
        return (Double[]) newArray;
    }
}
