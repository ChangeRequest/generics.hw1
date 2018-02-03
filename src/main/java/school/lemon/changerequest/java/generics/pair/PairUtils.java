package school.lemon.changerequest.java.generics.pair;

public class PairUtils {

    public static boolean equals(Pair<?, ?> first, Pair<?, ?> second) {
        return first.getKey().equals(second.getKey()) && first.getValue().equals(second.getValue());
    }

    public static <KeyType extends Comparable<KeyType>> int compareTo(Pair<KeyType, ?> first,
                                                                      Pair<KeyType, ?> second) {
        return first.getKey().compareTo(second.getKey());
    }

    public static Object[] getValues(Pair<?, ?>[] array) {
        Object[] result = new Object[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].getValue();
        return result;
    }

    public static Object[] getKeys(Pair<?, ?>[] array) {
        Object[] result = new Object[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].getKey();
        return result;
    }

    public static <KeyType extends Comparable<KeyType>> int countGreaterThan(Pair<KeyType, ?>[] array, KeyType value) {
        int result = 0;
        for (Pair<KeyType, ?> a : array)
            if (a.getKey().compareTo(value) > 0)
                result++;
        return result;
    }

    public static <KeyType> boolean containsUniqueObjects(Pair<KeyType, ?>[] array) {
        for (int i = 0; i < array.length; i++) {
            KeyType tmp = array[i].getKey();
            for (int j = i + 1; j < array.length; j++)
                if (tmp.equals(array[j].getKey()))
                    return false;
        }
        return true;
    }
}
