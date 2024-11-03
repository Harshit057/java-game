import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Type 0 for Rock, 1 for Paper, or 2 for Scissors.");

        // Player choice
        System.out.print("Enter your choice: ");
        int playerChoice = scanner.nextInt();

        // Computer choice
        int computerChoice = random.nextInt(3);

        System.out.println("You chose: " + options[playerChoice]);
        System.out.println("Computer chose: " + options[computerChoice]);

        // Determine the winner
        if (playerChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                   (playerChoice == 1 && computerChoice == 0) ||
                   (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
