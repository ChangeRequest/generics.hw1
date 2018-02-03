package school.lemon.changerequest.java.generics.generator;

import school.lemon.changerequest.java.generics.container.GenericContainer;

public class DoubleGenerator extends NumberGenerator {

    @Override
    public GenericContainer<Double> generateNumbers() {
        GenericContainer<Double> array = new GenericContainer<Double>();
        for (int i = 0; i < NUMBER_OF_GENERATED_NUMBERS; i++)
            array.add(generator.nextDouble());
        return array;
    }
}
