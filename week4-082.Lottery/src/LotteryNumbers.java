import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random rand = new Random();
        while(numbers.size() < 7){
            int temp = rand.nextInt(39) + 1;
            if(!containsNumber(temp)) numbers.add(temp);
        }
    }

    public boolean containsNumber(int number) {
        if(numbers.contains(number)) return true;
        return false;
    }
}
