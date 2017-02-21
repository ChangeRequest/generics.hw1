package school.lemon.changerequest.java.generics.Generator;

public class DoubleSumCalculator extends SumCalculator<Double> {
    @Override
    public Double calculateSum(Double[] array) {
        Double sum = .0;
        for (Double anArray : array) {
            sum += anArray;
        }
        return sum;
    }
}
