import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = "";
        
        while(input != null){
            System.out.println("Type a word: ");
            input = reader.nextLine();
            if(input.isEmpty()) break;
            words.add(input);
        }
        
        System.out.println("You typed the following words:");
        for(String i: words){
            System.out.println(i);
        }
    }
}
