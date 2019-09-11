
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String inputName = reader.nextLine();
        
        int index = 0;
        while(index < inputName.length()){
            System.out.println((index + 1) + ". character: " + inputName.charAt(index));
            index++;
        }
    }
}
