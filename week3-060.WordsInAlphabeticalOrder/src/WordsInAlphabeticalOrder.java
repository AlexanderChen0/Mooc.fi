
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> arrList = new ArrayList<String>();

        while(true){
            System.out.println("Type a word: ");
            String input = reader.nextLine();
            if(input.equals("")) break;
            arrList.add(input);
        }
        
        Collections.sort(arrList);
        for(String word : arrList){
            System.out.println(word);
        }
    }
}
