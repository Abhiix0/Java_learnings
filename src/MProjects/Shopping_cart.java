import java.util.Scanner;

public class Shopping_cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Setup the "Cart" (Arrays with 5 empty slots)
        String[] items = new String[5];
        double[] prices = new double[5];

        int count = 0; // Tracks how many items are in the cart
        double total = 0;

        System.out.println("--- SHOPPING CART (Max 5 Items) ---");

        // 2. Loop until cart is full (5 items)
        while (count < 5) {
            System.out.print("Enter item name (or type 'exit' to stop): ");
            String name = scan.next(); // simple .next() for one word names

            if (name.equals("exit")) {
                break; // Stop the loop if user types exit
            }

            System.out.print("Enter price: ");
            double price = scan.nextDouble();

            // 3. Store the data in the arrays
            items[count] = name;
            prices[count] = price;
            total = total + price;

            count++; // Move to the next slot
        }

        // 4. Print the final receipt
        System.out.println("\n--- YOUR RECEIPT ---");

        // Loop only through the items we actually added
        for (int i = 0; i < count; i++) {
            System.out.println(items[i] + " : $" + prices[i]);
        }

        System.out.println("--------------------");
        System.out.println("TOTAL: $" + total);

        scan.close();
    }
}