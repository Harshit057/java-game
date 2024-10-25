import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a random object to generate a random number
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        // Loop until the player guesses the correct number
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Provide feedback to the player
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
