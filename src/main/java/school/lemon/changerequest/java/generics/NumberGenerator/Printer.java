package school.lemon.changerequest.java.generics.NumberGenerator;

/**
 * Created by lera on 27.12.16.
 */
public class Printer<T extends Number> {

    NumberGeneratorImp numb;

    public Printer(NumberGeneratorImp numb) {
        this.numb = numb;
    }

    public T generateAndPrint() {
        T[] numb1 = (T[]) numb.generateNumbers();
        T count;
        for (T number : numb1) {
            count += (T) number;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberGeneratorImp d = new DoubleGenerator();
        Printer printer = new Printer(d);
        printer.generateAndPrint();

        NumberGeneratorImp i = new IntegerGenerator();
        Printer printer1 = new Printer(i);
        printer1.generateAndPrint();

//        System.out.println(Arrays.asList(d.generateNumbers()).toString());
    }
}
