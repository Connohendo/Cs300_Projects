public class doubleLinkedList {
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public doubleLinkedList(){
        //head = new Node(null, null, null);
        //tail = new Node(null, null, null);
    }

    public void addFirst(String name)
    {
        Node newest = new Node(name,null,null);
        if(head == null){
            head = newest;
            tail = newest;
        }
        else {
            addBetween(name, head, head.getNext());
        }
    }

    public void addLast(String name)
    {
        addBetween(name, tail.getPrev(), tail);
    }

    public void addBetween(String name, Node predecessor, Node successor) {
        Node newest = new Node(name, predecessor, successor);
        newest.setPrev(predecessor);
        newest.setNext(successor);
        predecessor.setNext(newest);
        if(successor != null) {
            successor.setPrev(newest);
        }
        size++;
    }
}


