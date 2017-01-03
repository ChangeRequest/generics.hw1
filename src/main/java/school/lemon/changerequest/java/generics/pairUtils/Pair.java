package school.lemon.changerequest.java.generics.pairUtils;

/**
 * Created by User on 01.01.2017.
 */
public class Pair<K,V> {
    private K key;
    private V value;
    public Pair (K key, V value) {
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

