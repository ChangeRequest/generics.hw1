package school.lemon.changerequest.java.generics.NumberGenerator;

import java.util.Random;

/**
 * Created by lera on 27.12.16.
 */
public class DoubleGenerator extends NumberGeneratorImp<Double> {
    Double[] arrayDoubles;
    Double sum = new Double(0.);

    public DoubleGenerator() {
        this.arrayDoubles = new Double[10];
    }

    @Override
    public Double[] generateNumbers() {
        Random randNumber = new Random();
        for (int i = 0; i < arrayDoubles.length; i++) {
            arrayDoubles[i] = randNumber.nextDouble();
        }
        return arrayDoubles;
    }

    @Override
    public Double calcSum() {
        for (int i = 0; i < arrayDoubles.length; i++) {
            sum += arrayDoubles[i];
        }
        return sum;
    }
}
