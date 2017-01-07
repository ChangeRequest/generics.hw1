package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 27.12.16.
 */
public class Printer<T extends Number> {
    NumberGenerator<T> numberGenerator;

    public Printer(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void generateAndPrint() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        T[] array = numberGenerator.generateNumbers();
        SumCalculator s1;
        if (numberGenerator instanceof DoubleGenerator) {
            s1 = new SumCalculatorDouble();
        } else {
            s1 = new SumCalculatorInteger();
        }
        System.out.println(s1.calculateSum(array));
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        NumberGenerator doubleGenerator = new DoubleGenerator();
        Printer printer = new Printer(doubleGenerator);
        printer.generateAndPrint();

        NumberGenerator integerGenerator = new IntegerGenerator();
        Printer printer1 = new Printer(integerGenerator);
        printer1.generateAndPrint();
    }
}
