
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        double c = (double)a / b;
        
        System.out.println("Division: " + a + " / " + b + " = " + c);
    }
}
