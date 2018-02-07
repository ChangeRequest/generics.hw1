package school.lemon.changerequest.java.generics.generator;

import school.lemon.changerequest.java.generics.container.GenericContainer;

import java.util.Random;

public abstract class NumberGenerator<T extends Number> {

    protected static final int NUMBER_OF_GENERATED_NUMBERS = 10;
    protected final Random generator;

    NumberGenerator(Random generator) {
        this.generator = generator;
    }

    public abstract GenericContainer<? extends Number> generateNumbers();
}
