package school.lemon.changerequest.java.generics.container;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by User on 02.01.2017.
 */
public class Container <T> {
    ArrayList<T> container= new ArrayList<T>();
    public  Container (){
    }
public int size(Container e){
    if(e==null)throw new NullPointerException();
    return container.size();
}
public void clear(Container e){
    if(e==null)throw new NullPointerException();
    container.clear();
}
public void add(T element){

    container.add(element);
}
public T get(int index){
    return container.get(index);
}
public void add(T element, int index){
    container.add(index, element);
}
public void remove(int index){
    container.remove(index);
}


}
