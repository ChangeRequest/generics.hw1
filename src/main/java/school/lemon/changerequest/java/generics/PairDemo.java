package java.school.lemon.changerequest.java.generics;

import java.util.Arrays;

/**
 * Created by lera on 24.12.16.
 */
public class PairDemo {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Ivanov");
        Pair<Integer, String> pair2 = new Pair<>(1, "Ivanov");
        Pair<Integer, String> pair3 = new Pair<>(3, "Petrov");
        Pair<Integer, String> pair4 = new Pair<>(4, "Sidorov");
        Pair<Integer, String>[] pairs = (Pair<Integer, String>[]) new Pair[4];
        pairs[0] = pair1;
        pairs[1] = pair2;
        pairs[2] = pair3;
        pairs[3] = pair4;
        System.out.println(PairUtil.equals(pair1, pair2));
        System.out.println(PairUtil.equals(pair1, pair3));
        System.out.println(Arrays.asList(PairUtil.getValues(pairs)));
        System.out.println(Arrays.asList(PairUtil.getKeys(pairs)));
        System.out.println(Arrays.asList(PairUtil.countGreaterThan(pairs, 1)));
        System.out.println(Arrays.asList(PairUtil.containsUniqueObjects(pairs)));
    }
}
