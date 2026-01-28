public class LoopsDemo {
    public static void main(String[] args) {
        // 1. for loop = execute some code a certain amount of time
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. while loop = execute some code while condition remain true
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3. do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // 4. for-each loop (array)
        System.out.println("\nFor-Each Loop:");
        int[] nums = {10, 20, 30, 40, 50};
        for (int n : nums) {
            System.out.println(n);

        }
    }
}