import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String inputName = reader.nextLine();
        char lastChar = lastCharacter(inputName);
        System.out.println("Last character: " + lastChar);
    }
    
    public static char lastCharacter(String text){
        return text.charAt(text.length() - 1);
    }
}
