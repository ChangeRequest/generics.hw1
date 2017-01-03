package school.lemon.changerequest.java.generics.pairUtils;

import java.util.HashSet;

/**
 * Created by User on 01.01.2017.
 */
public class PairUtils<K, V> {
    private K key;
    private V value;

    public PairUtils(Pair a) {
        this.key = (K) a.getKey();
        this.value = (V) a.getValue();
    }


    public static boolean equals(Pair a, Pair b) {
        if (a.getClass() == b.getClass()) return false;
        if (a instanceof Pair && b instanceof Pair) {
            if (!(a.getValue().getClass() == b.getValue().getClass())) return false;
            if (!(a.getKey().getClass() == b.getKey().getClass())) return false;
            if (!(a.getKey() == b.getKey())) return false;
            if (!(a.getValue() == b.getValue())) return false;
        }
        return true;
    }


    public static int compareTo(Pair a, Pair b) {
        if (a.getClass() == b.getClass()) throw new ClassCastException();
        if (a instanceof Pair && b instanceof Pair) {
            if (!(a.getValue().getClass() == b.getValue().getClass())) throw new ClassCastException();
            if (!(a.getKey().getClass() == b.getKey().getClass())) throw new ClassCastException();
            if (a.getValue() == null | b.getValue() == null) throw new NullPointerException();
            if (a.getKey() == null | b.getKey() == null) throw new NullPointerException();


        }
        return (int) ((Pair) a).getValue() - (int) ((Pair) b).getValue();
    }

    public static <V> V[] getValues(Pair[] a) {
        V[] resultl = (V[]) new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            resultl[i] = (V) a[i].getValue();
        }
        return resultl;
    }

    public static <V> V[] getKeys(Pair[] a) {
        V[] resultl = (V[]) new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            resultl[i] = (V) a[i].getKey();
        }
        return resultl;
    }

    public static <P> int countGreaterThan(Pair[] a, P parameter) {
        if (a == null | parameter == null) throw new NullPointerException();
        if (a.length == 0) return 0;
        if (!(a[0].getKey().getClass() == parameter.getClass())) throw new ClassCastException();
        int counter = 0;
        for (int i = 0; i < a.length; i++) {

            if (((Integer) a[i].getKey() - (Integer) (parameter)) > 0) {
                counter++;
            }
        }
        return counter;
    }
    public static <V>int ContainsUniqueObjects(Pair[]a){
        if (a == null) throw new NullPointerException();
        if (a.length == 0) return 0;

        HashSet<V> UniqueObjects= new HashSet<V>();
        for (int i=0;i<a.length;i++){
            UniqueObjects.add((V) a[i].getValue());
        }

        return UniqueObjects.size();
    }

}
