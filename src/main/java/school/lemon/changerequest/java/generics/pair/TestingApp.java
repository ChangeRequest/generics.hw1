package school.lemon.changerequest.java.generics.pair;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yaroslav Pavlinskiy on 22.12.2016.
 */
public class TestingApp {
    public static void main(String[] args) {
        Pair p1 = new Pair<>(1,"k1");
        Pair p2 = new Pair<>(2,"k2");
        Pair p4 = new Pair<>(3,"k3");

        Pair[] pA = new Pair[3];
        pA[0] = p1;
        pA[1] = p2;
        pA[2] = p4;
        //Test for compareTo
        System.out.println(PairUtils.compareTo(p1,p2));
        //Test for getValue
        System.out.println("Value: "+Arrays.asList(PairUtils.getValue(pA)));
        //Test for getKey
        System.out.println("Key: "+Arrays.asList(PairUtils.getKey(pA)));
        //Test for countGraterThan
        System.out.println(PairUtils.countGreaterThan(pA,1));
        //Test for check unique objects
        System.out.println(PairUtils.containsUniqueObjects(pA));

    }

}
