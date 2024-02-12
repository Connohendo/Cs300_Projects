import java.io.File;
import java.util.*;

public class Tester {

        public static void main(String[] args) throws Exception {

                // Scanner created to ride from the input file
            Scanner input = new Scanner(new File("C:\\Users\\conno\\IdeaProjects\\Project5\\src\\textfile"));

               //Create Map
            Map<String, Integer> count = new HashMap<>();

               // Scanner reads in the next line from the inout file
            String line = input.nextLine();

               // cycles through lines
            while(input.hasNextLine()){
            // printing the line for testing
                //System.out.println(line);

                //catching new line characters and trimming the white space
                if(!line.trim().equals("")) {
                    //splitting the line into words
                    String[] words = line.split(" ");

                    // running through all the words
                    for(String word : words){
                        if(word == null || word.trim().equals("")){
                            continue;
                        }

                        //clean words to lowercase and no punctuation
                        String processed = word.toLowerCase();
                        processed = processed.replaceAll("\\p{Punct}","");

                        //if we have encountered this word increment
                        if(count.containsKey(processed)){
                            count.put(processed, count.get(processed) + 1);
                        }
                        //if we have not seen this word yet set it to 1
                        else{
                            count.put(processed, 1);
                        }
                    }
                }
                //grab next line
                line = input.nextLine();
            }
            System.out.println(count);

//            int mostUsed = 0;
//            String theWord = null;
//            for(String word : count.keySet()){
//                Integer theVal = count.get(word);
//                if(theVal > mostUsed){
//                    mostUsed = theVal;
//                    theWord = word;
//                }
//            }
//            System.out.printf("The most used word is %s, %d times",theWord, mostUsed);

            // making a list to sort then print to 20 greatest values
            List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(count.entrySet());

            // Sort the list
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });



            // put data from sorted list into hashmap
            HashMap<String, Integer> sorted = new LinkedHashMap<String, Integer>();
            for(Map.Entry<String, Integer> aa : list){
                sorted.put(aa.getKey(),aa.getValue());
            }
            //prints Sorted Hash map
            System.out.println(sorted);

            // loops through the sorted lists last 20 entries and prints them
            int i = list.size()-1;
            int counter =19;
            while(counter >= 0){
                System.out.println(list.get(i));
                i--;
                counter--;
            }
        }
}
