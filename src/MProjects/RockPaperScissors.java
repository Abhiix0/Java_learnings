package MProjects;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Enter number of rounds:");
            int rounds = sc.nextInt();

            int playerScore = 0;
            int computerScore = 0;

            for (int i = 1; i <= rounds; i++) {
                System.out.println("Round " + i + " - Enter your move (rock/paper/scissors):");
                String playerMove = sc.next().toLowerCase();
                String computerMove = getComputerMove(rand);

                System.out.println("Computer chose: " + computerMove);

                int roundResult = decideWinner(playerMove, computerMove);
                if (roundResult == 1) {
                    System.out.println("You win this round!");
                    playerScore++;
                } else if (roundResult == -1) {
                    System.out.println("Computer wins this round!");
                    computerScore++;
                } else {
                    System.out.println("Round is a tie!");
                }
            }

            System.out.println("Final Score - You: " + playerScore + " | Computer: " + computerScore);

            System.out.println("Do you want to play again? (yes/no)");
            String ans = sc.next().toLowerCase();
            if (ans.equals("no")) {
                keepPlaying = false;
            }
        }

        sc.close();
        System.out.println("Thanks for playing Rock Paper Scissors!");
    }

    public static String getComputerMove(Random rand) {
        String[] moves = {"rock", "paper", "scissors"};
        return moves[rand.nextInt(moves.length)];
    }

    // Returns 1 if player wins, -1 if computer wins, 0 if tie
    public static int decideWinner(String player, String computer) {
        if (player.equals(computer)) return 0;
        switch (player) {
            case "rock": return (computer.equals("scissors") ? 1 : -1);
            case "paper": return (computer.equals("rock") ? 1 : -1);
            case "scissors": return (computer.equals("paper") ? 1 : -1);
            default:
                System.out.println("Invalid move!");
                return 0;
        }
    }
}
