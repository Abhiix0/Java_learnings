import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args){
        // Enhanced Switch = A replacement for many else if statements
        Scanner scan = new Scanner(System.in);
        System.out.println("which day you are striving in?");
        String day = scan.nextLine().toLowerCase();
        scan.close();

        switch (day) {
            case "monday"    -> System.out.println("It is a weekday 😫");
            case "tuesday"   -> System.out.println("It is a weekday 😫");
            case "wednesday" -> System.out.println("It is a weekday 😫");
            case "thursday"  -> System.out.println("It is a weekday 😫");
            case "friday"    -> System.out.println("It is a weekday 😫");
            case "saturday"  -> System.out.println("It is the weekend 🙂");
            case "sunday"    -> System.out.println("It is the weekend 🙂");
            default -> System.out.println("Is that a day?");
        }
/*
We can use it like this too,
String day = "Friday";

switch (day) {
    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
            System.out.println("Weekday 😫");
    case "Saturday", "Sunday" ->
            System.out.println("Weekend 🙂");
}

 */
    }
}
