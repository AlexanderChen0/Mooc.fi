
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Up to what number? ");
        int endPoint = Integer.parseInt(reader.nextLine());
        
        int count = 1;
        while(count<= endPoint){
            System.out.println(count);
            count++;
        }
    }
}
