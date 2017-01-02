package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 01.01.17.
 */
public class NumberGeneratorImp<T extends Number> extends NumberGenerator<T> {

    @Override
    public <T extends Number> T[] generateNumbers() {
        T[] nums1 = (T[]) new Object[10];
        return (T[]) nums1;
    }
}

