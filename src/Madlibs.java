import java.util.Scanner;
public class Madlibs {
    public static void main(String[] args){
        // 1. Set up the scanner to get user input
        Scanner scan = new Scanner(System.in);

        System.out.println("--- SHORT & FUNNY MAD LIBS ---");

        // 2. Ask the user for words
        System.out.print("Enter an Adjective (e.g., smelly, glowing): ");
        String adj = scan.nextLine();

        System.out.print("Enter a Celebrity Name: ");
        String celeb = scan.nextLine();

        System.out.print("Enter a Noun (object): ");
        String noun = scan.nextLine();

        System.out.print("Enter a Funny Sound (e.g., Yeet, Moo): ");
        String sound = scan.nextLine();

        // 3. Print the resulting story
        System.out.println("--- YOUR STORY ---");
        System.out.println("I walked into the " + adj + " bathroom.");
        System.out.println("Suddenly, I saw " + celeb + " eating a " + noun + "!");
        System.out.println("I screamed " + sound.toUpperCase() + " and ran away.");

        // 4. Close the scanner
        scan.close();
    }
}
