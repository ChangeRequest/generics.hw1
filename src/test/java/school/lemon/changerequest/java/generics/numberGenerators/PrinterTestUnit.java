package school.lemon.changerequest.java.generics.numberGenerators;

import org.junit.*;

/**
 * Created by User on 03.01.2017.
 */
public class PrinterTestUnit {
    IntegerGenerator generator= new IntegerGenerator();
    @org.junit.Test
    public void testToString(){
        Printer printer=new Printer();
        Integer[] test=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        String expected="Integers:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ]";
        String result=printer.toString(test);
        Assert.assertEquals(expected,result);
    }
}
