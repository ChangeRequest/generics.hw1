package school.lemon.changerequest.java.generics.NumberGenerator;

import java.util.Arrays;

/**
 * Created by lera on 27.12.16.
 */
public class Printer<T extends Number> {

    NumberGeneratorImp<T> numb;

    public Printer(NumberGeneratorImp numb1) {
        this.numb = numb1;
    }

    public T generateAndPrint() {
        numb.generateNumbers();
        return numb.calcSum();
    }

    public static void main(String[] args) {
        NumberGeneratorImp d = new DoubleGenerator();
        Printer printer = new Printer(d);

        NumberGeneratorImp i = new IntegerGenerator();
        Printer printer1 = new Printer(i);

        System.out.println(printer.generateAndPrint());
        System.out.println(printer1.generateAndPrint());
    }
}
