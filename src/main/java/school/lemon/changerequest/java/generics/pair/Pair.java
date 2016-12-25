package school.lemon.changerequest.java.generics.pair;

/**
 * Created by Yaroslav Pavlinskiy on 22.12.2016.
 */
public class Pair <K,V> {
    protected V value;
    protected K key;

    public Pair(K key,V value) {
        this.value = value;
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public boolean contains(K key)
    {
        if(this.getKey() == key)
            return true;
        return false;
    }
}

