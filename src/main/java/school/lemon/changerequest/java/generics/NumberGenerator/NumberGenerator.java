package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 24.12.16.
 */
public abstract class NumberGenerator<T extends Number> {

    public abstract <T extends Number> T[] generateNumbers();
}
