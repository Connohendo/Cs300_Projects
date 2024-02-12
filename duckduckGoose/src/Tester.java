public class Tester {
    public static void main(String[] args) {
        String[] names = {"Alice", "Sally", "Robert", "Joan", "Polly", "Tim", "Stan"};
        int roundnumber = 1;
        int totalrounds = 2;
        DuckDuckGoose game1 = new DuckDuckGoose(names); //Notice player names are included in constructor
        while(roundnumber <= totalrounds) {
            System.out.println("------ Round Number " + roundnumber + " ------");
            System.out.println("Before playing:");
            game1.chooseGoose(roundnumber);
            System.out.println("Current Ducks: ");
            game1.chooseDucks();
            game1.listPlayers(); //Expected to list the players with a Goose selected
            String winner = game1.playRound();
            System.out.println(winner);
            System.out.println("After playing:");
            game1.listPlayers();//Should reflect the results of the game.
            roundnumber++;
        }
    }
}