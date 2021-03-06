package lessons.homeworks.tasks170712;

import java.util.Arrays;

public class MyStack <E>
{
    private static final int DEFAULT_MAX_SIZE = 3;
    private E[] elements;
    private int size;

    public MyStack()
    {
        this(DEFAULT_MAX_SIZE);
    }

    public MyStack(int maxSize)
    {
        elements = (E[]) new Object[maxSize];
    }

    public boolean push(E element)
    {
        if (size >= elements.length)
        {
            return false; //stack overflow
        }

        elements[size++] = element;
        return true;
    }

    public int size()
    {
        return size;
    }


    public E pop()
    {
        if (size <= 0)
        {
            return null; //stack underflow
        }

        E result = elements[--size];
        elements[size] = null;

        return result;
    }

    public E tos()
    {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString()
    {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
