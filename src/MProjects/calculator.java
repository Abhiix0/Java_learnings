package MProjects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter an operator (+, -, *, /):");
            char op = sc.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            double result = calculate(num1, num2, op);
            System.out.println("Result: " + result);

            System.out.println("Do you want to calculate again? (yes/no)");
            String ans = sc.next().toLowerCase();
            if (ans.equals("no")) {
                keepRunning = false;
            }
        }

        sc.close();
        System.out.println("Thanks for using Calculator!");
    }

    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b != 0) return a / b;
                else {
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }
            default:
                System.out.println("Unknown operator!");
                return 0;
        }
    }
}
