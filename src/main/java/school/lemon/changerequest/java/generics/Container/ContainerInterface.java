package school.lemon.changerequest.java.generics.Container;


public interface ContainerInterface<T> {

    int INITIAL_ARRAY_SIZE = 10;

    /**
     * Get current size of container
     *
     * @return current size of container
     */
    int size();

    /**
     * Clear container
     */
    void clear();

    /**
     * Get element by {@code index}
     *
     * @param index of the element
     * @return element at specified {@code index} or {@code null} in case {@code index < 0 || index >= size}
     */
    T get(int index);


    /**
     * Add element at specified {@code index} of container
     * In case {@code index < 0 || index > size} - do not add element.
     *
     * @param element to add
     * @param index   of the element
     * @return true if element was successfully added, otherwise - false.
     */
    boolean add(T element, int index);

    /**
     * Removes element in specified index
     *
     * @param index of the element
     * @return true if element was successfully deleted, otherwise - false.
     */
    boolean remove(int index);

    public void add(T element);

}
