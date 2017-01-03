package school.lemon.changerequest.java.generics.numberGenerators;

import org.junit.*;

/**
 * Created by User on 03.01.2017.
 */
public class DoubleGeneratorTestUnit {
    DubleGenerator generator= new DubleGenerator();
    private  final int sizeOfGenerator=10;
    @org.junit.Test
    public void testSizeOfIntegerGenerator(){
        int expected =sizeOfGenerator;
        int result= generator.size(generator);
        Assert.assertEquals(expected,result);
    }
    @org.junit.Test
    public void testWhatTypeOfNumberGeneratesShouldBeDouble(){
        Double[] test=new Double[]{1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        Assert.assertEquals(generator.get(generator,1).getClass(),test[1].getClass());
    }
}
