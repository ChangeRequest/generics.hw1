package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 07.01.17.
 */
public class SumCalculatorDouble extends SumCalculator<Double> {

    @Override
    public Double calculateSum(Double[] array) {
        Double sum = new Double(0.);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

