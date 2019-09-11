import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String inputName = reader.nextLine();
        
        int index = inputName.length() - 1;
        System.out.print("In reverse order: ");
        while(index >= 0){
            System.out.print(inputName.charAt(index));
            index--;
        }
    }
}
