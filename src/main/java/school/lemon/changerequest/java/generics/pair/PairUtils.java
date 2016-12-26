package school.lemon.changerequest.java.generics.pair;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Yaroslav Pavlinskiy on 22.12.2016.
 */
public final class PairUtils
{
    public static <K,V> boolean equals(Pair<K,V> a,Pair<K,V> b)
    {
        if(a == b)
            return true;
        if(a == null || b == null)
            return false;
        if(a.getKey() == b.getKey() && a.getValue() == b.getValue())
            return true;
        return false;
    }

    public static <K extends Comparable<K>,V> int compareTo(Pair<K,V> a,Pair<K,V> b)
    {
        return a.getKey().compareTo(b.getKey());
    }

    public static <K,V> V[] getValue(Pair<K,V>[] a)
    {
        V[] arrayOfValue = (V[]) new Object[a.length];
        for(int i = 0; i < a.length; i++)
        {
            arrayOfValue[i] = (V) a[i].getValue();
        }
        return arrayOfValue;
    }

    public static <K,V> K[] getKey(Pair<K,V>[] a)
    {
        K[] arrayOfKey = (K[]) new Object[a.length];
        for(int i = 0; i < a.length; i++)
        {
            arrayOfKey[i] = (K) a[i].getKey();
        }
        return arrayOfKey;
    }

    public static <K extends Comparable<K>,V> int countGreaterThan (Pair<K,V>[] a, K key)
    {
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
          if(key.compareTo(a[i].getKey()) == -1)
              count++;
        }
        return count;
    }

    public static <K,V> boolean containsUniqueObjects(Pair<K,V>[] a)
    {
      for(int i = 0; i < a.length; i++)
      {
          for(int j = i+1; j < a.length; j++)
          {
              if(a[i].getKey().equals(a[j].getKey()))
                  return false;
          }
      }
      return true;
    }


}
