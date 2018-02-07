package school.lemon.changerequest.java.generics.generator;

import school.lemon.changerequest.java.generics.container.GenericContainer;

import java.util.Random;

public class IntegerGenerator extends NumberGenerator<Integer> {

    IntegerGenerator(Random generator) {
        super(generator);
    }

    @Override
    public GenericContainer<Integer> generateNumbers() {
        GenericContainer<Integer> array = new GenericContainer<Integer>();
        for (int i = 0; i < NUMBER_OF_GENERATED_NUMBERS; i++)
            array.add(generator.nextInt());
        return array;
    }
}
