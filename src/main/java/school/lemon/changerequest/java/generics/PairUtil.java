package java.school.lemon.changerequest.java.generics;

/**
 * Created by lera on 20.12.16.
 */
public final class PairUtil {

    public static <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static <K extends Comparable<K>, V> int compareTo(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().compareTo(p2.getKey());
    }

    public static <V> V[] getValues(Pair[] pairs) {
        V[] array = (V[]) new Object[pairs.length];
        int i = 0;
        for (Pair p : pairs) {
            array[i] = (V) p.getValue();
            i++;
        }
        return array;
    }

    public static <K> K[] getKeys(Pair[] pairs) {
        K[] array = (K[]) new Object[pairs.length];
        int i = 0;
        for (Pair p : pairs) {
            array[i] = (K) p.getKey();
            i++;
        }
        return array;
    }

    public static <K extends Comparable> int countGreaterThan(Pair[] pairs, K element) {

        int i = 0;

        for (Pair p : pairs) {
            if (element.compareTo((K) p.getKey()) == -1)
                i++;
        }
        return i;
    }

    public static <K> boolean containsUniqueObjects(Pair[] pairs) {
        K[] array = (K[]) new Object[pairs.length];
        int i = 0;
        for (Pair p : pairs) {
            array[i] = (K) p.getKey();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] == array[k]) return false;

            }
        }
        return true;
    }

}
