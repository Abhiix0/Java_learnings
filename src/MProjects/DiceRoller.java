package MProjects;

import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean keepRolling = true;

        while (keepRolling) {
            System.out.println("Enter the number of dice to roll:");
            int diceCount = sc.nextInt();

            System.out.println("Rolling " + diceCount + " dice...");
            for (int i = 1; i <= diceCount; i++) {
                int roll = rand.nextInt(6) + 1; // 1 to 6
                System.out.println("Dice " + i + ": " + roll);
            }

            System.out.println("Do you want to roll again? (yes/no)");
            String ans = sc.next().toLowerCase();
            if (ans.equals("no")) {
                keepRolling = false;
            }
        }

        sc.close();
        System.out.println("Thanks for using Dice Roller!");
    }
}
