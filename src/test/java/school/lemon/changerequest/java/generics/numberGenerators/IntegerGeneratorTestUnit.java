package school.lemon.changerequest.java.generics.numberGenerators;

import org.junit.*;

/**
 * Created by User on 03.01.2017.
 */
public class IntegerGeneratorTestUnit {
    IntegerGenerator generator= new IntegerGenerator();
    private  final int sizeOfGenerator=10;
    @org.junit.Test
    public void testSizeOfIntegerGenerator(){
        int expected =sizeOfGenerator;
        int result= generator.size(generator);
        Assert.assertEquals(expected,result);
    }
    @org.junit.Test
    public void testWhatTypeOfNumberGeneratesShouldBeInteger(){
        Integer[] test=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Assert.assertEquals(generator.get(generator,1).getClass(),test[1].getClass());
    }
}
