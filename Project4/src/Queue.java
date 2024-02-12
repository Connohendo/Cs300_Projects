public interface Queue<E> {
    //add an element to the queue
    public void enqueue(E e);
    //remove an element from the queue
    public E dequeue();
    //returns the current size of the queue
    public int size();
    //returns true if queue empty,false otherwise
    public boolean isEmpty();
    //returns the first item of the queue without removing it
    public E first();
}
