import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        /*int randomNo = random.nextInt(numberOfSides +1);
        while(randomNo == 0)randomNo = random.nextInt(numberOfSides +1);*/
        //Following is a simpler solution with no while loop
        return random.nextInt(numberOfSides) + 1;
    }
}
