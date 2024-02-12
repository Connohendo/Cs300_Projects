public class ArrayStack<E> implements Stack<E> {
    private E[] data;
    private static int capacity = 1000;
    private int size = 0;

    public ArrayStack(int capacity) {
        data = (E[])new Object[capacity];
    }

    public ArrayStack() {
        this(capacity);
    }
    public int size() {return size;}

    public boolean isEmpty() { return size == 0;}

    public void push(E e)
    {
        data[size] = e;
        size++;
    }

    public E top()
    {
        if(isEmpty()) { return null;}
        else { return data[size -1];}
    }

    public E pop()
    {
        if(isEmpty()) { return null;}
        E temp = data[size -1];
        data[size-1] = null;
        size--;
        return temp;
    }

    public E lose(){
        if(isEmpty()) { return null;}
        data[size-1] = null;
        size--;
        return null;
    }
}