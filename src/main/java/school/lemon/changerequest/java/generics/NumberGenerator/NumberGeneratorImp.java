package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 01.01.17.
 */
public class NumberGeneratorImp<T extends Number> extends NumberGenerator<T> {
    T[] arrayT;

    public NumberGeneratorImp() {
    }

    @Override
    public T[] generateNumbers() {
        return (T[]) arrayT;
    }

    public <T extends Number> T calcSum() {
        T sum = (T) new Object();
        return sum;
    }

}

