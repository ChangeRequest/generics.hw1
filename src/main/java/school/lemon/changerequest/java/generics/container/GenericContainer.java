package school.lemon.changerequest.java.generics.container;

import java.util.Arrays;

public class GenericContainer<T> {

    public static final int INITIAL_ARRAY_SIZE = 10;
    private T[] container;
    private int containerSize = 0;

    @SafeVarargs
    public GenericContainer(T... values) {
        container = newArray(INITIAL_ARRAY_SIZE);
    }

    @SafeVarargs
    private static <T> T[] newArray(int size, T... array) {
        return Arrays.copyOf(array, size);
    }

    public int size() {
        return containerSize;
    }

    public void clear() {
        containerSize = 0;
    }

    public T get(int index) {
        if (!isIndexCorrect(index))
            return null;
        else
            return container[index];
    }

    public void add(T element) {
        add(element, containerSize);
    }

    public boolean add(T element, int index) {
        if (index < 0 || index > containerSize)
            return false;
        if (containerSize == container.length) {
            T[] tmp = newArray(containerSize * 2);
            System.arraycopy(container, 0, tmp, 0, index);
            tmp[index] = element;
            System.arraycopy(container, index, tmp, index + 1, containerSize - index);
            container = tmp;
        } else {
            for (int i = containerSize; i > index; i--)
                container[i] = container[i - 1];
            container[index] = element;
        }
        containerSize++;
        return true;
    }

    public boolean remove(int index) {
        if (!isIndexCorrect(index))
            return false;
        System.arraycopy(container, index + 1, container, index, containerSize - index - 1);
        containerSize--;
        return true;
    }

    private boolean isIndexCorrect(int index) {
        if (index < 0 || index >= containerSize)
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < containerSize; i++)
            result.append(container[i]).append(' ');
        return result.toString();
    }
}
