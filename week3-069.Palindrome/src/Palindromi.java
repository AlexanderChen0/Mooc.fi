import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reversed = "";
        int i = text.length() - 1;
        while(i >= 0){
            reversed += text.charAt(i);
            i--;
        }
        if(reversed.equals(text)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
