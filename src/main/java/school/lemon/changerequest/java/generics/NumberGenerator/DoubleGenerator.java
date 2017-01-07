package school.lemon.changerequest.java.generics.NumberGenerator;
import java.util.Random;

/**
 * Created by lera on 27.12.16.
 */
public class DoubleGenerator extends NumberGenerator<Double> {

    @Override
    public Double[] generateNumbers() {
        Double[] arrayDoubles = new Double[10];
        Random randNumber = new Random();
        for (int i = 0; i < arrayDoubles.length; i++) {
            arrayDoubles[i] = randNumber.nextDouble();
        }
        return arrayDoubles;
    }
}
