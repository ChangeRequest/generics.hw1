package school.lemon.changerequest.java.generics.NumberGenerator;

import java.util.Random;

/**
 * Created by lera on 01.01.17.
 */
public class IntegerGenerator extends NumberGenerator<Integer> {

    @Override
    public Integer[] generateNumbers() {
        Integer[] arrayInteger = new Integer[10];
        Random randNumber = new Random();
        for (int i = 0; i < 10; i++) {
            arrayInteger[i] = randNumber.nextInt();
        }
        return arrayInteger;
    }
}