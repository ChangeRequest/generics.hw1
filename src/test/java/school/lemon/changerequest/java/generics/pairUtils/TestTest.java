package school.lemon.changerequest.java.generics.pairUtils;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 03.01.2017.
 */
public class TestTest {
    @Test
    public void testEquals() {
        Pair pair1 = new Pair(1, 1);
        Pair pair2 = new Pair(1, 1);
        boolean expected= true;
        boolean result = PairUtils.equals(pair1,pair2);
        Assert.assertEquals(expected,result);
    }
}
