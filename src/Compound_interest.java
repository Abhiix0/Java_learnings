import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--- COMPOUND INTEREST CALCULATOR ---");

        // 1. Get the Principal (Initial Money)
        System.out.print("Enter Principal Amount: ");
        double principal = scan.nextDouble();

        // 2. Get the Rate (Percentage)
        System.out.print("Enter Annual Rate (e.g., 5 for 5%): ");
        double rate = scan.nextDouble();

        // 3. Get the Time (Years)
        System.out.print("Enter Time in Years: ");
        double time = scan.nextDouble();

        // 4. Calculate the Final Amount
        // Math.pow(base, exponent) handles the power part
        double amount = principal * Math.pow((1 + rate / 100), time);

        // 5. Calculate just the Interest gained
        double interest = amount - principal;

        System.out.println("\n--- RESULTS ---");
        System.out.println("Total Amount: " + amount);
        System.out.println("Interest Gained: " + interest);

        scan.close();
    }
}