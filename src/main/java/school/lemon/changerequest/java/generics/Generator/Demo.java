package school.lemon.changerequest.java.generics.Generator;

public class Demo {
    public static void main(String[] args) {
        DoubleGenerator doubleGenerator = new DoubleGenerator();
        Printer printer1 = new Printer(doubleGenerator);
        IntegerGenerator integerGenerator = new IntegerGenerator();
        Printer printer2 = new Printer(integerGenerator);
        printer1.generateAndPrint();
        printer2.generateAndPrint();


    }
}
