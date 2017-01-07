package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 07.01.17.
 */
public abstract class SumCalculator<T extends Number> {

    public abstract T calculateSum(T[] array);
}


