package school.lemon.changerequest.java.generics.Generator;

public class Printer<T extends Number> {
    NumberGenerator<T> numberGenerator;
    SumCalculator<T> sum;

    public Printer(NumberGenerator<T> numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void generateAndPrint() {
        T[] arrayNumbers = numberGenerator.generateNumbers();
        if (numberGenerator instanceof IntegerGenerator) {
            sum = (SumCalculator<T>) new IntegerSumCalculator();
        } else {
            sum = (SumCalculator<T>) new DoubleSumCalculator();
        }
        System.out.println(sum.calculateSum(arrayNumbers));
    }
}
