import java.util.*;

public class Task_01 {

    public static void main(String[] args) {
        guessTheNumber();
    }

    public static void guessTheNumber() {
        // Step 1: Generate a random number within the specified range
        int lowerLimit = 1;
        int upperLimit = 100;
        int secretNumber = new Random().nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

        // Additional details
        int maxAttempts = 10;
        int roundsPlayed = 0;
        int score = 0;

        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (playAgain) {
            System.out.println("\nRound " + (roundsPlayed + 1));
            System.out.println("Guess the number between " + lowerLimit + " and " + upperLimit);

            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts && !guessedCorrectly) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            // Display the result of the round
            if (guessedCorrectly) {
                System.out.println("You guessed the number in " + attempts + " attempts!");
                score++;
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
            }

            // Step 6: Allow the user to play againS
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
            roundsPlayed++;
        }

        // Step 7: Display the user's score
        System.out.println("\nGame Over! You played " + roundsPlayed + " round(s) and your score is " + score + ".");
    }
}
