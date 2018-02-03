package school.lemon.changerequest.java.generics.generator;

import school.lemon.changerequest.java.generics.container.GenericContainer;

public class Printer {

    private NumberGenerator generator;

    Printer(NumberGenerator gen) {
        generator = gen;
    }

    public void generateAndPrint() {
        GenericContainer<? extends Number> array = generator.generateNumbers();
        double middle = 0;
        for (int i = 0; i < array.size(); i++)
            middle += array.get(i).doubleValue();
        middle /= array.size();
        System.out.println("Middle = " + middle);
    }
}
