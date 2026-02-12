package MProjects;
//24R21A6778
import java.util.ArrayList;
import java.util.Scanner;

public class MiniBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {"Paneer", "Potatoes", "Milk"};
        int[] prices = {300, 120, 50};

        ArrayList<Integer> cart = new ArrayList<>();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        while (true) {
            System.out.println("\n===== GROCERY STORE MENU =====");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < products.length; i++) {
                    System.out.println((i + 1) + ". " + products[i] + " - ₹" + prices[i]);
                }
            }

            else if (choice == 2) {
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                if (id >= 1 && id <= products.length) {
                    cart.add(id - 1);
                    System.out.println(products[id - 1] + " added to cart.");
                } else {
                    System.out.println("Invalid Product ID!");
                }
            }

            else if (choice == 3) {
                if (cart.size() == 0) {
                    System.out.println("Cart is empty!");
                } else {
                    int total = 0;
                    System.out.println("\n===== FINAL BILL =====");
                    System.out.println("Customer: " + name);

                    for (int i : cart) {
                        System.out.println(products[i] + " - ₹" + prices[i]);
                        total += prices[i];
                    }

                    System.out.println("--------------");
                    System.out.println("Total: ₹" + total);
                }
            }

            else if (choice == 4) {
                System.out.println("Bye!");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
