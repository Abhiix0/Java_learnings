import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
       //Ternary operator ? = return 1 of 2 values if a condition is true
       //variable = (condition)? (value1)ifTrue : (value2)ifFalse;
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
       int score = scan.nextInt();
       scan.close();
       String PassorFail = (score > 40)? "Pass": "Fail";
        System.out.println(PassorFail);
        //There are different use cases for the ternary operator
    }
}
