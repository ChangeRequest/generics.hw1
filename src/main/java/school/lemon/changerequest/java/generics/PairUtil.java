package school.lemon.changerequest.java.generics;

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

    public static <K, V> V[] getValues(Pair<K, V>[] pairs) {
        V[] array = (V[]) new Object[pairs.length];
        int i = 0;
        for (Pair p : pairs) {
            array[i] = (V) p.getValue();
            i++;
        }
        return array;
    }

    public static <K, V> K[] getKeys(Pair<K, V>[] pairs) {
        K[] array = (K[]) new Object[pairs.length];
        int i = 0;
        for (Pair p : pairs) {
            array[i] = (K) p.getKey();
            i++;
        }
        return array;
    }

    public static <K extends Comparable, V> int countGreaterThan(Pair<K, V>[] pairs, K element) {
        int i = 0;
        for (Pair p : pairs) {
            if (element.compareTo((K) p.getKey()) == -1)
                i++;
        }
        return i;
    }

    public static <K, V> boolean containsUniqueObjects(Pair<K, V>[] pairs) {
        for (int j = 0; j < pairs.length; j++) {
            for (int k = j + 1; k < pairs.length; k++) {
                if (pairs[j].getKey().equals(pairs[k].getKey())) return false;
            }
        }
        return true;
    }
}
