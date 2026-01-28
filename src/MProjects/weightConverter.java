package MProjects;
import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean keepRunning = true;

        while(keepRunning){
            System.out.println("enter the value to convert:");
            double value = scan.nextDouble();

            System.out.println("Enter the unit you're converting from (kg/g/lb/oz):");
            String fromUnit = scan.next().toLowerCase();

            System.out.println("Enter the unit you want to convert to (kg/g/lb/oz):");
            String toUnit = scan.next().toLowerCase();

            double result = convertWeight(value, fromUnit, toUnit);
            System.out.println(value + " " + fromUnit + " = " + result + " " + toUnit);

            System.out.println("Do you want to convert another? (yes/no)");
            String ans = scan.next().toLowerCase();
            if (ans.equals("no")) {
                keepRunning = false;
            }
        }

        scan.close();
        System.out.println("Thanks for using Weight Converter!");
     }
    public static double convertWeight(double value, String from, String to) {
        double valueInKg = 0;

        // Step 1: Convert any input to kg first
        switch (from) {
            case "kg":
                valueInKg = value;
                break;
            case "g":
                valueInKg = value / 1000;
                break;
            case "lb":
                valueInKg = value / 2.20462;
                break;
            case "oz":
                valueInKg = value / 35.274;
                break;
            default:
                System.out.println("Unknown 'from' unit");
                return 0;
        }

        // Step 2: Convert kg to target unit
        switch (to) {
            case "kg":
                return valueInKg;
            case "g":
                return valueInKg * 1000;
            case "lb":
                return valueInKg * 2.20462;
            case "oz":
                return valueInKg * 35.274;
            default:
                System.out.println("Unknown 'to' unit");
                return 0;
        }
    }
}

