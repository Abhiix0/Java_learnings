package MProjects;

//24R21A6778

import java.time.Year;
import java.util.Scanner;
public class retirementCalculator {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your current age? ");
        int currentAge = sc.nextInt();

        if (currentAge <= 0) {
            System.out.println("Invalid age");
        } else {
            System.out.println("At What age would you like to retire? ");
            int retireAge = sc.nextInt();
            int left = retireAge - currentAge;
            System.out.println("You have " + left + " years left until you can retire.");
            int currentYear = Year.now().getValue();
            int retiredYear = currentYear + left;
            System.out.println("it's " + currentYear + ", so you can retire in " + retiredYear);
            sc.close();
        }
    }
}
