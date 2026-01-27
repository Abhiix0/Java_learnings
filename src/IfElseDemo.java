public class IfElseDemo {
    public static void main(String[] args) {

        int age = 22;

        if (age >= 18) {
            System.out.println("You are legit!");
        } else if (age < 0) {
            System.out.println("You born yet?");
        } else {
            System.out.println("You are a minor!");
        }
    }
}
