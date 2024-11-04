import java.util.Scanner;
import java.util.HashSet;

public class hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"java", "hangman", "computer", "programming", "game"};
        String wordToGuess = words[(int) (Math.random() * words.length)];
        HashSet<Character> guessedLetters = new HashSet<>();
        int attemptsLeft = 6;
        boolean wordGuessed = false;

        System.out.println("Welcome to Hangman!");
        System.out.println("Try to guess the word, one letter at a time.");

        while (attemptsLeft > 0 && !wordGuessed) {
            displayWord(wordToGuess, guessedLetters);
            System.out.print("\nGuess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter. Try another one.");
            } else if (wordToGuess.indexOf(guess) >= 0) {
                System.out.println("Good guess!");
                guessedLetters.add(guess);
            } else {
                System.out.println("Wrong guess! You lose an attempt.");
                attemptsLeft--;
                guessedLetters.add(guess);
            }

            wordGuessed = checkIfWordGuessed(wordToGuess, guessedLetters);

            System.out.println("Attempts left: " + attemptsLeft);
        }

        if (wordGuessed) {
            System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("\nGame Over! The word was: " + wordToGuess);
        }
        scanner.close();
    }

    // Method to display the current state of the word being guessed
    private static void displayWord(String wordToGuess, HashSet<Character> guessedLetters) {
        for (char letter : wordToGuess.toCharArray()) {
            if (guessedLetters.contains(letter)) {
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }

    // Method to check if the player has guessed the whole word
    private static boolean checkIfWordGuessed(String wordToGuess, HashSet<Character> guessedLetters) {
        for (char letter : wordToGuess.toCharArray()) {
            if (!guessedLetters.contains(letter)) {
                return false;
            }
        }
        return true;
    }
}
