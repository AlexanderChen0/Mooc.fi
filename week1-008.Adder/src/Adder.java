
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: " + (a + b));
    }
}
