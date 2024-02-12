//
//class DoublyLinkedList {
//    //A node class for doubly linked list
//    class Node {
//        String name;
//        Node previous;
//        Node next;
//
//        public Node(String name) {
//            this.name = name;
//        }
//    }
//
//    //Initially, head and tail is set to null
//    Node head, tail = null;
//
//    //add a node to the list
//    public void addNode(String name) {
//        //Create a new node
//        Node newNode = new Node(name);
//
//        //if list is empty, head and tail points to newNode
//        if (head == null) {
//            head = tail = newNode;
//            //head's previous will be null
//            head.previous = null;
//            //tail's next will be null
//            tail.next = null;
//        } else {
//            //add newNode to the end of list. tail->next set to newNode
//            tail.next = newNode;
//            //newNode->previous set to tail
//            newNode.previous = tail;
//            //newNode becomes new tail
//            tail = newNode;
//            //tail's next point to null
//            tail.next = null;
//        }
//    }
//
//    //print all the nodes of doubly linked list
//    public void printNodes() {
//        //Node current will point to head
//        Node current = head;
//        if (head == null) {
//            System.out.println("Doubly linked list is empty");
//            return;
//        }
//        System.out.println("Nodes of doubly linked list: ");
//        while (current != null) {
//            //Print each node and then go to next.
//            System.out.print(current.name + " ");
//            current = current.next;
//        }
//    }
//}
public class Node{
    private String element;
    private Node next;
    private Node prev;

    public Node(String name, Node prev, Node next)
    {
        this.element = name;
        this.prev = prev;
        this.next = next;
    }

    public Node getNext() {return next;}
    public void setNext(Node next){this.next = next;}

    public Node getPrev() {return prev;}
    public void setPrev(Node prev){this.prev = prev;}

    public String getElement() {return element;}




    //Same as above different implementation
    //public void setNext(Node<E> newest) {next = newest;}
}
