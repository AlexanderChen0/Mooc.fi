
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.println("Please enter a numer: ");
            double inputNum = Double.parseDouble(reader.nextLine());
            if(inputNum < -30 || inputNum > 40){
                System.out.println("Invalid number. Enter a value between -30 and 40");
            } else Graph.addNumber(inputNum);
        }
        // Graph is used as follows:
        /*Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);*/
        // Remove or comment out these lines above before trying to run the tests.
    }
}
