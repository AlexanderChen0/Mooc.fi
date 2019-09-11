
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        int power = 0;
        while(power <= input){
            result += (int) Math.pow(2, power);
            power++;
        }
        System.out.println("The result is " + result);
    }
}
