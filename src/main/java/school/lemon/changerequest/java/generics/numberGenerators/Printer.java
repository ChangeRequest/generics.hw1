package school.lemon.changerequest.java.generics.numberGenerators;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 02.01.2017.
 */
public class Printer<T> {


    public void generateAndPrint() {
        int numberOfMethods = 2;
        double randomNumbers = Math.random() * numberOfMethods;
        if (randomNumbers < 1) {
            DubleGenerator dubleGeneratorForPrint = new DubleGenerator();
            System.out.println(toString(dubleGeneratorForPrint.NumberGenerator()));
        }
        if (randomNumbers > 1&&randomNumbers < 2) {
            IntegerGenerator intGeneratorForPrint = new IntegerGenerator();
            System.out.println(toString(intGeneratorForPrint.NumberGenerator()));
        }
    }


    public String toString(Number[] n) {
        StringBuilder sb = new StringBuilder( );
        if(n instanceof Double[]){sb.append("Doubles:[");}
        if(n instanceof Integer[]){sb.append("Integers:[");}
        for (int i = 0; i < n.length; i++) {
            sb.append(n[i]);
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}