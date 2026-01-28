public class BreakContinueDemo {
    public static void main(String[] args) {

        // break example
        System.out.println("Break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;   // stops the loop completely
            }
            System.out.println(i);
        }

        // continue example
        System.out.println("\nContinue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips only this iteration
            }
            System.out.println(i);
        }
    }
}
