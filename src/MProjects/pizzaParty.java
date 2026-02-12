package MProjects;


//24R21A6778
import java.util.Scanner;
public class pizzaParty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Case 1: Exact Division");
        System.out.println("How many people?");
        int people = sc.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizza = sc.nextInt();
        System.out.println("how many slices per pizza?");
        int slices = sc.nextInt();
        int slice = pizza * slices;
        System.out.println(people + " people with " + pizza + "pizzas" + "(" + slice + "slices)");
        int eachPerson = slice / people;
        int left = slice % people;
        System.out.println("Each person gets " + eachPerson + " slices");
        if(left > 0) {
            System.out.println("Case 2: With leftover");
            System.out.println("There are " + left + " Leftover pieces");
        }
        if(left == 0) {
            System.out.println("There are " + "0" + " Leftover pieces");
        }
        System.out.println("Case 3:");
        System.out.println("How many people?");
        int ppl = sc.nextInt();

        System.out.println("how many slices does each person want?");
        int ppl_slices = sc.nextInt();

        System.out.println("how many slices per pizza?");
        int slicess = sc.nextInt();

        int Pizzas = ppl * ppl_slices;
        int total = (Pizzas + slicess - 1) / slicess;

        System.out.println("You have to order " + total + " pizzas");

        sc.close();
    }
}
