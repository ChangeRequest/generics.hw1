package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 07.01.17.
 */
public class SumCalculatorInteger extends SumCalculator<Integer> {

    @Override
    public Integer calculateSum(Integer[] array) {
        Integer sum = new Integer(0);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

