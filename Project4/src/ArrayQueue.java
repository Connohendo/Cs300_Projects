public class ArrayQueue<E> implements Queue<E> {
    private E[] data;
    private int capacity = 1000;
    private int size = 0;
    private int f = 0;

    public ArrayQueue(int capacity) {
        data = (E[])new Object[capacity];
        this.capacity = capacity;

    }

    public ArrayQueue(){
        this(1000);
    }

    @Override
    public void enqueue(E e) throws IllegalStateException{
        if (size == capacity) throw new IllegalStateException("Exceeded capacity");
        int insertlocation = (f+size) % capacity;
        data[insertlocation] = e;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty() == true)
            return null;
        E answer = data[f];
        data[f] = null;
        size--;
        f++;
        if (f == capacity)
            f = 0;
        return answer;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size > 0)
            return false;
        else
            return true;
    }

    @Override
    public E first() {
        return data[f];
    }
}
