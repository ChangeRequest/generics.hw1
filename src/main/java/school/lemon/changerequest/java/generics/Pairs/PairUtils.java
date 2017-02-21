package school.lemon.changerequest.java.generics.Pairs;

/**
 * Created by lbrdev on 21.02.2017.
 * Project: generics.hw1
 */
public final class PairUtils {

    public static <K, V> boolean equals(Pair<K, V> pair1, Pair<K, V> pair2) {
        boolean flag = false;
        if (pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue())) {
            flag = true;
        }
        return flag;
    }

    public static <K extends Comparable<K>, V> int compareTo(Pair<K, V> pair1, Pair<K, V> pair2) {
        return pair1.getKey().compareTo(pair2.getKey());
    }

    public static <K, V> V[] getValues(Pair<K, V>[] pairs) {
        V[] valuesArray = (V[]) new Object[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            valuesArray[i] = pairs[i].getValue();
        }
        return valuesArray;
    }

    public static <K, V> K[] getKeys(Pair<K, V>[] pairs) {
        K[] keysArray = (K[]) new Object[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            keysArray[i] = pairs[i].getKey();
        }
        return keysArray;
    }

    public static <K extends Comparable<K>, V> int countGreaterThan(Pair<K, V>[] pairs, K parameter) {
        int counter = 0;
        for (Pair<K, V> pair : pairs) {
            if (parameter.compareTo(pair.getKey()) == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static <K, V> boolean containsUniqueObjects(Pair<K, V>[] pairs) {
        for (Pair<K, V> pair : pairs) {
            int i = 1;
            while (i < pairs.length) {
                if (pair.getKey().equals(pairs[i].getKey())) return false;
                i++;
            }
        }
        return true;
    }

}
