public class NestedLoopsDemo {
    public static void main(String[] args){
        //nested loops =  A loop inside another loop, mostly used often with matrices and DSA

        // 1. Basic nested loop (row & column)
        System.out.println("1. Row & Column:");
        for (int i = 1; i <= 3; i++) {          // rows
            for (int j = 1; j <= 3; j++) {      // columns
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 2. Square star pattern
        System.out.println("\n2. Square Pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. Right triangle pattern
        System.out.println("\n3. Right Triangle:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 4. Number triangle
        System.out.println("\n4. Number Triangle:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 5. Inverted triangle
        System.out.println("\n5. Inverted Triangle:");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
