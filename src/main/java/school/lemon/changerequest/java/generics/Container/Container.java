package school.lemon.changerequest.java.generics.Container;


public class Container<T> implements ContainerInterface<T> {

    private T[] array;
    private int size;

    public Container() {
        this.array = (T[]) new Object[INITIAL_ARRAY_SIZE];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else return array[index];
    }

    @Override
    public boolean add(T element, int index) {
        if (index < 0 || index > size) return false;
        checkSize();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        ++size;
        return true;
    }


    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size)
            return false;
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        --size;
        return true;
    }

    @Override
    public void add(T element) {
        checkSize();
        array[size++] = element;

    }

    public void checkSize() {
        if (size == array.length) {

            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public String toString() {
        StringBuilder containerToString = new StringBuilder();
        for (int i = 0; i < size; i++) {
            containerToString.append(array[i]).append(" ");
        }
        return String.valueOf(containerToString);
    }
}
