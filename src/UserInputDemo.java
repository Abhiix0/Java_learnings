import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite song: ");
        String song = scanner.nextLine();
        System.out.println("I love " + song + " too");

        System.out.print("Enter your favorite novel: ");
        String novel = scanner.next();
        System.out.println(novel);

        System.out.print("Publication year: ");
        int year = scanner.nextInt();
        System.out.println(year);

        scanner.close();
    }
}
