import java.util.Scanner;
import java.util.Random;


public class Guess {
    public static void main (String[] args) {
        Random random = new Random();
        int secretNum = random.nextInt(10) + 1;
        int numGuesses = 0;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

    while (guess != secretNum) {
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();
        numGuesses++;

        if (guess < secretNum) {
            System.out.println("Your guess is too low.");
        } else if (guess > secretNum) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("You got it!");
        }
    }
    System.out.println("It took you" + numGuesses + " guesses, ");
    scanner.close();
}
}