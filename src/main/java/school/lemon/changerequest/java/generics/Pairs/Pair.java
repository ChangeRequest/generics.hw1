package school.lemon.changerequest.java.generics.Pairs;

/**
 * Created by lbrdev on 21.02.2017.
 * Project: generics.hw1
 */
public class Pair<K, V> {

    public K key;
    public V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
