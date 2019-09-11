
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<String>();

        while(true){
            System.out.println("Type a word: ");
            String input = reader.nextLine();
            if(arrList.contains(input)) {
                System.out.println("You gave the word " + input + " twice");
                break;
            }
            arrList.add(input);
        }
    }
}
