package MProjects;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean keepPlaying = true;

        while (keepPlaying) {
            int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            boolean guessed = false;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (!guessed) {
                System.out.println("Enter your guess:");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congrats! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String ans = sc.next().toLowerCase();
            if (ans.equals("no")) {
                keepPlaying = false;
            }
        }

        sc.close();
        System.out.println("Thanks for playing Number Guessing Game!");
    }
}
