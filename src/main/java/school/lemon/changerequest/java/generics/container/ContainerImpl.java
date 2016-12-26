package school.lemon.changerequest.java.generics.container;

/**
 * Created by Yaroslav Pavlinskiy on 26.12.2016.
 */
public class ContainerImpl<E> implements Container<E>{
    private int size;
    private E[] array;

    ContainerImpl()
    {
        this.array = (E[]) new Object[10];
    }

    public int size()
    {
        return this.size;
    }

    public void clear()
    {
        this.size = 0;
    }

    public void add(E element)
    {
        checkSize();
        array[size++] = element;
    }

    public E get(int index)
    {
        if(index < 0 || index >= size())
            return null;
        return array[index];
    }

    public boolean add(E element, int I)
    {
        if (I < 0 || I > size)
            return false;
        checkSize();
        System.arraycopy(array, I, array, I + 1, size - I);
        array[I] = element;
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

    private void checkSize()
    {
        if(size == array.length)
        {
            E[] newArray = (E[]) new Object[array.length * 2];
            System.arraycopy(array,0,newArray,0,array.length);
            array = newArray;
        }
    }



}
