package school.lemon.changerequest.java.generics.NumberGenerator;

import java.util.Random;

/**
 * Created by lera on 01.01.17.
 */
public class IntegerGenerator extends NumberGeneratorImp<Integer> {
    Integer[] arrayInteger;
    Integer sum = new Integer(0);

    public IntegerGenerator() {
        this.arrayInteger = new Integer[10];
    }

    @Override
    public Integer[] generateNumbers() {
        Random randNumber = new Random();
        for (int i = 0; i < 10; i++) {
            arrayInteger[i] = randNumber.nextInt();
        }
        return arrayInteger;
    }

    @Override
    public Integer calcSum() {
        for (int k = 0; k < arrayInteger.length; k++) {
            sum += arrayInteger[k];
        }
        return sum;
    }
}