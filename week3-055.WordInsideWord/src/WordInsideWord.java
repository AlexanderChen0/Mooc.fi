
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first word: ");
        String fullString = reader.nextLine();
        
        System.out.println("Type the second word: ");
        String lookingFor = reader.nextLine();
        
        if(fullString.indexOf(lookingFor) == -1){
            System.out.println("The word '" + lookingFor + "' is not found in the word '" + fullString + "'.");
        } else System.out.println("The word '" + lookingFor + "' is found in the word '" + fullString + "'.");
    }
}
