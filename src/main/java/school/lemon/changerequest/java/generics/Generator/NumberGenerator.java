package school.lemon.changerequest.java.generics.Generator;

public abstract class NumberGenerator<T extends Number> {
    static int DEFAULT_SIZE_TEN = 10;

    public abstract T[] generateNumbers();
}
