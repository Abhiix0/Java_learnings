package MProjects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    static double balance = 1000000.0; // Starting money
    static String[] symbols = {"🍒", "🍋", "🔔", "⭐", "7️⃣"};
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playing = true;

        System.out.println("=== 🎰 Welcome to Slot Machine ===");
        System.out.println("Starting Balance: ₹" + balance);

        while (playing && balance > 0) {
            System.out.println("\nEnter bet amount (or 0 to quit): ₹");
            double bet = sc.nextDouble();

            if (bet == 0) {
                playing = false;
                break;
            }

            if (bet > balance || bet < 0) {
                System.out.println("Invalid bet amount!");
                continue;
            }

            balance -= bet;

            String[] result = spin();

            System.out.println("Result: " + result[0] + " | " + result[1] + " | " + result[2]);

            double winnings = calculateWinnings(result, bet);
            balance += winnings;

            if (winnings > 0) {
                System.out.println("🎉 You won ₹" + winnings);
            } else {
                System.out.println("😢 No win this time.");
            }

            System.out.println("Current Balance: ₹" + balance);
        }

        if (balance <= 0) {
            System.out.println("\n💀 You ran out of money!");
        }

        System.out.println("Thanks for playing Slot Machine!");
        sc.close();
    }

    public static String[] spin() {
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = symbols[rand.nextInt(symbols.length)];
        }
        return result;
    }

    public static double calculateWinnings(String[] result, double bet) {
        if (result[0].equals(result[1]) && result[1].equals(result[2])) {
            if (result[0].equals("7️⃣")) {
                return bet * 10; // Jackpot
            }
            return bet * 5; // Normal match
        }
        return 0;
    }
}

