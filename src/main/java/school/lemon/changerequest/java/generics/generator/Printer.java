package school.lemon.changerequest.java.generics.generator;

import school.lemon.changerequest.java.generics.container.GenericContainer;

public class Printer<T extends Number> {

    private final NumberGenerator<T> numberGenerator;

    Printer(NumberGenerator<T> numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void generateAndPrint() {
        GenericContainer<? extends Number> array = numberGenerator.generateNumbers();
        double sum = 0;
        for (int i = 0; i < array.size(); i++)
            sum += array.get(i).doubleValue();
        System.out.println("Sum = " + sum);
    }
}
