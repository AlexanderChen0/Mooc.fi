import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private int length;
    private Random randomizer = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        while(password.length() < length) password += alphabet.charAt(randomizer.nextInt(26));
        return password;
    }
}
