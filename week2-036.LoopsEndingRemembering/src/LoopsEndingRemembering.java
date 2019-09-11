import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int inputNum = Integer.parseInt(reader.nextLine());
        int sum = inputNum;
        int count = 1;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        
        while(inputNum != -1){
            if(inputNum % 2 == 0) even++;
            else odd++;
            inputNum = Integer.parseInt(reader.nextLine());
            if(inputNum == -1) break;
            else {
                sum += inputNum;
                count++;
            }
            
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + count);
        average = sum /(double) count;
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
