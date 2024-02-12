import java.util.Random;

public class HomeworkTester1 {
    public static void main (String[] args)
    {   ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
        //ArrayStack<Integer> stack1 = new ArrayStack<Integer>();
        InefficientQueue<Integer> badQueue = new InefficientQueue<Integer>();
        //Size of the array to use to enqueue/dequeue
        int numbersize = 100;
        Random rand = new Random();
        //Used to populate queue
        int[] randnumarray = new int[numbersize];
        //Fill the array with random integers
        for (int i = 0; i < numbersize; i++)
            randnumarray[i] = rand.nextInt();
        int f = 0;
        //while f < numbersize, call randomly
        //enqueue with randnumarray[f]
        //or dequeue, being verbose about what is happening
        while (f < numbersize) {
            int op = rand.nextInt(2);
            if (op == 0) {
                queue.enqueue(randnumarray[f]);
                badQueue.add(randnumarray[f]);
                System.out.println("Enqueued " + randnumarray[f]);
                f++;

                //todo: implement adding to inefficientQueue as well.
            }
            else {
                System.out.println("Dequeued object " + queue.dequeue());
                System.out.println("Dequeued imperfect " + badQueue.toss());
                //todo: implement dequeue in inefficientQueue as well. Compare equality of dequeued object
                //print an error if the objects are different and rethink your code.
            }

        }
        //this will allow us to clear the queue once all numbers have been placed
//        for(int j = 0; j < queue.size(); j++)
//        {
//            System.out.print(queue.dequeue());
//            //todo: implement dequeue in inefficientQueue as well. Compare equality of dequeued object
//            //print an error if the objects are different and rethink your code.
//        }
    }


}
