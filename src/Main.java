import java.sql.SQLOutput;
import java.util.Random;
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
        //Arithmetic Operators
        int x = 1;
        int y = 2;
        int z = x+y;
        System.out.println(z);
        //we can subtract, multiply, divide or modulus!
        /*
        augmented assignment operators
        x += y;
        we can subtract, multiply, divide or modulus here too...
        increment and decrement
        x++;
        x--;
        */

        //ORDER OF OPERATIONS (P-E-M-D-A-S)
        //PARENTHESIS-EXPONENTS-MULTIPLICATION-DIVISION-ADDITION-SUBTRACTION
        double res = 2 + 4 * (9-5)/2.0;
        System.out.println(res);

        //IF statements
        int num = 22;
        if(num >= 18){
            System.out.println("you are legit!");
        }
        else if (num < 0) {
            System.out.println("you born yet!?");
        }
        else{
            System.out.println("you are a minor!");
        }

        //random Numbers
        Random ran = new Random();
        int var;
        var = ran.nextInt(0,101);
        //the random variables show up in the range of 0 to 100
        // we can use the int, double and boolean too

        //Math Stuff
        System.out.println(Math.PI); // output = 3.14....
        System.out.println(Math.E); // output = 2.71...
        int power = (int) Math.pow(2, 3); //output = 8
        System.out.println(power);
        int abs = Math.abs(-5);
        System.out.println(abs); //output = 5
        int sqrt = (int)Math.sqrt(9);
        System.out.println(sqrt); // output = 3
        int round = (int)Math.round(13.34);
        System.out.println(round); // output = 13
        int ceil = (int)Math.ceil(13.23);
        System.out.println(ceil); // output = 14
        // floor to round down
        // we can use max(a,b) or min to find maximum and  minimum of two no.s


        //printf()
        String you = "Me";
        System.out.printf("you are %s",you);
        // you can use %c for char, %d for int, %f for double, %b for boolean
        // these are called specifier characters
        //same as C programming language
        double price = 12.304;
        System.out.printf("%.2f",price);
        //.2 in front of specifier is called as .precision
        double price1 = 12.4604;
        System.out.printf("%+.2f",price1); // output = +12.4604
        //[Flags]
        // + = output the plus
        // , = comma grouping separator
        // ( = negative no.s are enclosed in ()
        // space = display '-' if neg or ' ' for pos
        double id = 12;
        System.out.printf("%04f",id);
        //  0 = zero padding; output = 0012
        // number = right justified padding; output = __12
        // -number = left justified padding; output = 12__

        //NESTED IF STATEMENTS
        System.out.println("--- MYSTERY HOUSE ---");
        System.out.println("You see two doors.");
        System.out.print("Press 1 for Left, 2 for Right: ");
        int door = scanner.nextInt();

        // OUTER IF
        if (door == 1) {
            System.out.println("\nInside Door 1, you see a Lion!");
            System.out.print("Press 1 to Feed it, 2 to Poke it: ");
            int action = scanner.nextInt();

            // NESTED IF (Inside Door 1)
            if (action == 1) {
                System.out.println("RESULT: The lion is happy. You survive!");
            } else {
                System.out.println("RESULT: You poked a lion? You get eaten. RIP.");
            }

        } else {
            // OUTER ELSE (Door 2)
            System.out.println("\nInside Door 2, you see a Chest.");
            System.out.print("Press 1 to Open, 2 to Walk away: ");
            int chest = scanner.nextInt();

            // NESTED IF (Inside Door 2)
            if (chest == 1) {
                System.out.println("RESULT: You found gold! You are rich.");
            } else {
                System.out.println("RESULT: You walked away poor. Sad.");
            }
        }
    }
}
