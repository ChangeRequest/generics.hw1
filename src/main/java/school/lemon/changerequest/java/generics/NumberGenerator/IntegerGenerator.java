package school.lemon.changerequest.java.generics.NumberGenerator;

import java.util.Random;

/**
 * Created by lera on 01.01.17.
 */
public class IntegerGenerator extends NumberGeneratorImp<Integer> {

    @Override
    public <Integer extends Number> Integer[] generateNumbers() {
        java.lang.Integer[] newArray = new java.lang.Integer[10];
        for (int i = 0; i < 10; i++) {
            Random randNumber = new Random();
            newArray[i] = randNumber.nextInt();
        }
        return (Integer[]) newArray;
    }
}