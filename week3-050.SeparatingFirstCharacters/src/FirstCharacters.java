import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String inputName = reader.nextLine();
        
        int index = 0;
        while(index < 3){
            if(inputName.length() < 3) break;
            System.out.println((index + 1) + ". character: " + inputName.charAt(index));
            index++;
        }
    }
}
