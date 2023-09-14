import java.util.Random;

public class NumberGuessingGame {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100.");

        int guessCount = 0;
        while (true) {
            guessCount++;

            System.out.println("Enter your guess: ");
            int guess = Integer.parseInt(System.console().readLine());

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + guessCount + " guesses.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
    }
}
