
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int inputPoints = Integer.parseInt(reader.nextLine());
        
        if(inputPoints > 49){
            System.out.println("Grade: 5");
        } else if(inputPoints > 44){
            System.out.println("Grade: 4");
        } else if(inputPoints > 39){
            System.out.println("Grade: 3");
        } else if(inputPoints > 34){
            System.out.println("Grade: 2");
        } else if(inputPoints > 29){
            System.out.println("Grade: 1");
        } else System.out.println("Failed");
    }
}

/*
Points	Grade
0–29	failed
30–34	1
35–39	2
40–44	3
45–49	4
50–60	5
*/
