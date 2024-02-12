public interface Stack<E> {
    /** return number of elements on stack**/
    int size();

    /** returns if stack has 0 elements **/
    boolean isEmpty();

    /**places an item,e, on top of the stack **/
    void push(E e);

    /** returns the first item on the stack and removes it **/
    E pop();

    /** returns the first item on the stack without removing it **/
    E top();
}