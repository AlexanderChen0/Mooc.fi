import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int firstInput = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number: ");
        int secondInput = Integer.parseInt(reader.nextLine());
        
        if(firstInput == secondInput) System.out.println("The numbers are equal!");
        
        else {
            int greaterNumber = Math.max(firstInput, secondInput);
            System.out.println("Greater number: " + greaterNumber);
        }
        
    }
}
