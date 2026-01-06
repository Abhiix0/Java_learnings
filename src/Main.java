import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("One piece is real");
        System.out.println("This is peak!");
        System.out.println("A King Never Gives Up");
        //MY FIRST PRINT LINE DONE!!
        /* variables
        1.primitive - int, char, double, boolean
        2.reference - string, array, object
         */
        int ex = 29;
        System.out.println(ex);
        int age = 19;
        System.out.println("Age:" + age);
        double gpa = 99.99;
        System.out.println(gpa);
        char grade = 'A';
        System.out.println(grade);
        boolean isCosplayer = false;
        boolean isNerd = true;
        System.out.println(isNerd);
        System.out.println(isCosplayer);
        //strings
        String name = "chopper";
        System.out.println("Name is "+ name + " " + age + " Years old");

        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your fav song:");
        String song = scanner.nextLine();
        System.out.println("I love "+ song + " too");
        System.out.println("Got any fav Novel?");
        String novel = scanner.next(); //this next doesn't consider spaces and ends if they encounter a space
        System.out.println(novel);
        System.out.println("When did this novel published?");
        int year = scanner.nextInt();
        System.out.println(year);
        scanner.nextLine();//After int or double , we place a buffer so the Enter key isn't considered
        //you can use nextDouble() for double and nextBoolean() for boolean variable
        scanner.close(); //need to close once opened
    }
}
