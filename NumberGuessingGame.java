import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess (between 1 and 100): ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
