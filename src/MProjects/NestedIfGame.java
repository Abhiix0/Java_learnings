import java.util.Scanner;

public class NestedIfGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- MYSTERY HOUSE ---");
        System.out.print("Press 1 for Left, 2 for Right: ");
        int door = scanner.nextInt();

        if (door == 1) {
            System.out.print("Press 1 to Feed Lion, 2 to Poke: ");
            int action = scanner.nextInt();

            if (action == 1) {
                System.out.println("You survive!");
            } else {
                System.out.println("You got eaten 💀");
            }

        } else {
            System.out.print("Press 1 to Open Chest, 2 to Walk away: ");
            int chest = scanner.nextInt();

            if (chest == 1) {
                System.out.println("You found gold 💰");
            } else {
                System.out.println("You walked away poor 😔");
            }
        }

        scanner.close();
    }
}
