package school.lemon.changerequest.java.generics;

/**
 * Created by lera on 21.12.16.
 */


public class Container<T> {
    private T[] array;
    private int size;


    public Container() {
        this.array = (T[]) new Object[10];

    }

    private void checkSize() {
        if (size == array.length) {

            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }


    public int size() {
        return size;
    }


    public void clear() {
        size = 0;
    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else return array[index];
    }


    public void add(T element) {
        checkSize();
        array[size++] = element;

    }


    public boolean add(T element, int index) {
        if (index < 0 || index > size) return false;
        checkSize();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        ++size;
        return true;
    }


    public boolean remove(int index) {
        if (index < 0 || index >= size)
            return false;
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        --size;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder arrayInString = new StringBuilder();
        for (int i = 0; i < size; i++) {
            arrayInString.append(array[i] + " ");
        }
        return arrayInString + " size = " + size + ";";
    }
}

