package school.lemon.changerequest.java.generics.container;

/**
 * Created by Yaroslav Pavlinskiy on 26.12.2016.
 */
public interface Container<E> {
    int INITIAL_ARRAY_SIZE = 10;

    /**
     * Get current size of container
     * @return current size of container
     */
    int size();

    /**
     * Clear container
     */
    void clear();

    /**
     * Get element by {@code index}
     * @param index of the element
     * @return element at specified {@code index} or {@code null} in case {@code index < 0 || index > size}
     */
    E get(int index);

    /**
     * Add element at the end of container
     * @param element to add
     */
    void add(E element);

    /**
     * Add element at specified {@code index} of container
     * In case {@code index < 0 || index > size} - do not add element.
     * @param element to add
     * @param index of the element
     * @return true if element was successfully added, otherwise - false.
     */
    boolean add(E element,int index);

    /**
     * Removes element in specified index
     * @param index of the element
     * @return true if element was successfully deleted, otherwise - false.
     */
    boolean remove(int index);
}
