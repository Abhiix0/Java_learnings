package MProjects;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Enter the temperature value:");
            double value = sc.nextDouble();

            System.out.println("Enter the unit you're converting from (C/F/K):");
            String fromUnit = sc.next().toUpperCase();

            System.out.println("Enter the unit you want to convert to (C/F/K):");
            String toUnit = sc.next().toUpperCase();

            double result = convertTemperature(value, fromUnit, toUnit);
            System.out.println(value + " " + fromUnit + " = " + result + " " + toUnit);

            System.out.println("Do you want to convert another? (yes/no)");
            String ans = sc.next().toLowerCase();
            if (ans.equals("no")) {
                keepRunning = false;
            }
        }

        sc.close();
        System.out.println("Thanks for using Temperature Converter!");
    }

    public static double convertTemperature(double value, String from, String to) {
        double valueInC = 0;

        // Step 1: Convert any input to Celsius
        switch (from) {
            case "C": valueInC = value; break;
            case "F": valueInC = (value - 32) * 5 / 9; break;
            case "K": valueInC = value - 273.15; break;
            default: System.out.println("Unknown 'from' unit"); return 0;
        }

        // Step 2: Convert Celsius to target unit
        switch (to) {
            case "C": return valueInC;
            case "F": return valueInC * 9 / 5 + 32;
            case "K": return valueInC + 273.15;
            default: System.out.println("Unknown 'to' unit"); return 0;
        }
    }
}
