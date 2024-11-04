import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Answer the following questions by typing the correct option (a, b, c, or d).");

        // Question 1
        System.out.println("\n1. What is the capital of France?");
        System.out.println("a) London");
        System.out.println("b) Berlin");
        System.out.println("c) Paris");
        System.out.println("d) Madrid");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) Paris.");
        }

        // Question 2
        System.out.println("\n2. Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.println("d) Saturn");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();

        if (answer2.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) Mars.");
        }

        // Question 3
        System.out.println("\n3. Who wrote 'Hamlet'?");
        System.out.println("a) Charles Dickens");
        System.out.println("b) Mark Twain");
        System.out.println("c) William Shakespeare");
        System.out.println("d) Leo Tolstoy");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();

        if (answer3.equalsIgnoreCase("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) William Shakespeare.");
        }

        // Display the score
        System.out.println("\nQuiz Over! Your final score is: " + score + "/3");
        if (score == 3) {
            System.out.println("Excellent! You got all questions right.");
        } else if (score == 2) {
            System.out.println("Good job! You got 2 out of 3 correct.");
        } else if (score == 1) {
            System.out.println("You got 1 out of 3 correct. Keep trying!");
        } else {
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}
