import java.lang.String;
import java.util.Random;

public class DuckDuckGoose {
    //String[] children;
    String child;
    Node next;
    Node previous;
    doubleLinkedList children;
    Node Goose;
    doubleLinkedList ducks;

    public DuckDuckGoose(String[] names){
        children  = new doubleLinkedList();
        for(int i = 0; i<names.length;i++){
           // if(i == names.length - 1){
          //      children.addLast(names[i]);
           // }
            //else {
                children.addFirst(names[i]);
            //}
        }
    }

    public void listPlayers() {
        next = children.head;
        while(next != null) {
            //Print each node and then go to next.
            System.out.print(next.getElement() + " ");
            next = next.getNext();
        }
        System.out.println("");
    }
    public void listPlayers(doubleLinkedList list) {
        next = list.head;
        while(next != null) {
            //Print each node and then go to next.
            System.out.println(next.getElement() + " ");
            next = next.getNext();
        }
    }

    public String playRound(){
        next = ducks.head;
        String winner = "";
        Random rand = new Random();
        int upperbound = 6;
        int random = rand.nextInt(upperbound);
        int count = 1;
        while(count <= random){
            System.out.println(Goose.getElement() + " yelled Duck as they tapped " + next.getElement());
            if(count == random){
                winner = footRace(Goose, next);

            }

            next = next.getNext();
            count++;
        }
        return winner;
    }
    public void chooseGoose(int round){

        if(round == 1){
            next = children.head;
            Random rand = new Random();
            int upperbound = 7;
            int random = rand.nextInt(upperbound);
            int count = 1;
            while(count <= random){
                next = next.getNext();
                if(count == random){
                    Goose = next;
                }
                count++;
            }
        }
        System.out.println(Goose.getElement() + " is the Goose!");
    }

    public void chooseDucks(){
        next = children.head;
        ducks = new doubleLinkedList();
        while(next != null) {
            if(next != Goose){
                ducks.addFirst(next.getElement());
            }
            next = next.getNext();
        }
        listPlayers(ducks);
    }

    public String footRace(Node player1, Node player2){
        String winner = "";
        Random rand = new Random();
        int upperbound = 2;
        int random = rand.nextInt(upperbound);
        if(random == 1){
            winner = (player1.getElement() + " won the footrace! " + player2.getElement() + " is now Goose.");
            Goose = player2;
        }
        if(random == 2){
            winner = (player2.getElement() + " won the footrace! " + player1.getElement() + " is now Goose.");
            Goose = player1;
        }
        return winner;
    }
}
