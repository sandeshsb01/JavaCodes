import java.util.Scanner;
import java.util.Random;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10;
        boolean guessed = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println(
                "I have selected a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                attempts--;
                continue;
            }
            if (guess == numberToGuess) {
                System.out.println(
                        "Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                guessed = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

        }
        if (!guessed) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + numberToGuess);
        }
        scanner.close();
    }

}
