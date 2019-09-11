
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int endNum = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 1;
        while(count <= endNum){
            sum += count;
            count++;
        }
        System.out.println("Sum is " + sum);
    }
}
