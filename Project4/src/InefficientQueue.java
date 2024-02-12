public class InefficientQueue<E> extends ArrayStack<E> {
    private E[] data;
    private static int capacity = 1000;
    private int size = 0;
    ArrayStack<Integer> original = new ArrayStack<Integer>();
    ArrayStack<Integer> stackQueue = new ArrayStack<Integer>();

    public InefficientQueue(int capacity) {
        data = (E[])new Object[capacity];
    }

    public InefficientQueue() {
        this(capacity);
    }

    // used to add to the first stack
    public void add(int f){
        original.push(f);
        size++;
    }

    // original method used to create the queue off of the first stack
    public void createQueue() {
        for (int i = 0; i < size; i++) {
            stackQueue.push((int)original.pop());
        }
    }

    public E toss(){
        // building the queue by reversing the first stack
        for (int i = 0; i < size; i++) {
            stackQueue.push(original.pop());
        }

        // popping the top of the "queue"
        stackQueue.pop();

        // clearing the first stack
        for(int i = 0; i < size; i++){
            original.lose();
        }

        // building the original stack back updated
        for(int i = 0; i < size; i++){
            original.push(stackQueue.pop());
        }
        return null;
    }
}

