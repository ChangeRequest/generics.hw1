package school.lemon.changerequest.java.generics.generator;

import school.lemon.changerequest.java.generics.container.GenericContainer;

import java.util.Random;

public abstract class NumberGenerator {

    protected Random generator = new Random(System.currentTimeMillis());
    protected static final int NUMBER_OF_GENERATED_NUMBERS = 10;

    public abstract GenericContainer <? extends Number> generateNumbers();
}
