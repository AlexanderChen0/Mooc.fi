import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int end = Integer.parseInt(reader.nextLine());
        
        int mult = 1;
        int factorial = 1;
        while(mult <= end){
            factorial *= mult;
            mult++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
