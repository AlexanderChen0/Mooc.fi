
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int inputNum = Integer.parseInt(reader.nextLine());
        if(inputNum > 120 || inputNum < 0) System.out.println("Impossible!");
        else System.out.println("OK");
    }
}
