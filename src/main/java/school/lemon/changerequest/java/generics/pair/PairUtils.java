package school.lemon.changerequest.java.generics.pair;

import java.util.Arrays;

public class PairUtils {

    public static <KeyType, ValueType> boolean equals(Pair<KeyType, ValueType> first,
                                                      Pair<KeyType, ValueType> second) {
        notNull(first);
        notNull(second);
        return first.getKey().equals(second.getKey()) && first.getValue().equals(second.getValue());
    }

    public static <KeyType extends Comparable<KeyType>> int compareTo(Pair<KeyType, ?> first,
                                                                      Pair<KeyType, ?> second) {
        notNull(first);
        notNull(second);
        return first.getKey().compareTo(second.getKey());
    }

    public static <KeyType, ValueType> ValueType[] getValues(Pair<KeyType, ValueType>[] array) {
        notNullElementsInArray(array);
        ValueType[] result = newArray(array.length);
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].getValue();
        return result;
    }

    public static <KeyType, ValueType> KeyType[] getKeys(Pair<KeyType, ValueType>[] array) {
        notNullElementsInArray(array);
        KeyType[] result = newArray(array.length);
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].getKey();
        return result;
    }

    @SafeVarargs
    private static <T> T[] newArray(int size, T... array) {
        return Arrays.copyOf(array, size);
    }

    public static <KeyType extends Comparable<KeyType>, ValueType> int countGreaterThan(Pair<KeyType, ValueType>[] array, KeyType value) {
        notNullElementsInArray(array);
        int result = 0;
        for (Pair<KeyType, ValueType> a : array)
            if (a.getKey().compareTo(value) > 0)
                result++;
        return result;
    }

    public static <KeyType, ValueType> boolean containsUniqueObjects(Pair<KeyType, ValueType>[] array) {
        notNullElementsInArray(array);
        for (int i = 0; i < array.length; i++) {
            KeyType tmp = array[i].getKey();
            for (int j = i + 1; j < array.length; j++)
                if (tmp.equals(array[j].getKey()))
                    return false;
        }
        return true;
    }

    private static void notNull(Object o) {
        if (o == null)
            throw new NullPointerException();
    }

    private static void notNullElementsInArray(Pair[] pairs) {
        notNull(pairs);
        for (Pair o : pairs)
            notNull(o);
    }
}
