package school.lemon.changerequest.java.generics.Generator;

public class Printer<T extends Number> {
    NumberGenerator<T> numberGenerator;
    SumCalculator<T> sum;

    public Printer(NumberGenerator<T> numberGenerator) {
        this.numberGenerator = numberGenerator;
        if (numberGenerator instanceof IntegerGenerator) {
            this.sum = (SumCalculator<T>) new IntegerSumCalculator();
        } else {
            this.sum = (SumCalculator<T>) new DoubleSumCalculator();
        }
    }


    public void generateAndPrint() {
        T[] arrayNumbers = numberGenerator.generateNumbers();
        numberGenerator.getSumCalculator();
        System.out.println(sum.calculateSum(arrayNumbers));
    }
}
