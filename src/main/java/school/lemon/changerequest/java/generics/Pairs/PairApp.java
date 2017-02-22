package school.lemon.changerequest.java.generics.Pairs;

import java.util.Arrays;

/**
 * Created by lbrdev on 21.02.2017.
 * Project: generics.hw1
 */
public class PairApp {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Key1");
        Pair<Integer, String> pair2 = new Pair<>(1, "Key1");
        Pair<Integer, String> pair3 = new Pair<>(3, "Key2");
        Pair<Integer, String> pair4 = new Pair<>(4, "Key3");
        Pair[] pairs = new Pair[4];
        pairs[0] = pair1;
        pairs[1] = pair2;
        pairs[2] = pair3;
        pairs[3] = pair4;
        System.out.println(PairUtils.compareTo(pair1, pair2));
        System.out.println(PairUtils.compareTo(pair1, pair3));
        System.out.println(PairUtils.compareTo(pair4, pair2));
        System.out.println(PairUtils.equals(pair1, pair2));
        System.out.println(PairUtils.equals(pair1, pair3));
        System.out.println(Arrays.asList(PairUtils.getValues(pairs)));
        System.out.println(Arrays.asList(PairUtils.getKeys(pairs)));
        System.out.println(PairUtils.countGreaterThan(pairs, 1));
        System.out.println(PairUtils.countGreaterThan(pairs, 0));
        System.out.println(PairUtils.containsUniqueObjects(pairs));
    }
}
