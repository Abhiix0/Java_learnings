import java.util.Scanner;
public class ArraysDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================
        // 1️⃣ ONE DIMENSIONAL ARRAY
        // =========================
        System.out.println("1D Array:");
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("1D Array elements:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        // =========================
        // 2️⃣ TWO DIMENSIONAL ARRAY
        // =========================
        System.out.println("2D Array:");
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // =========================
        // 3️⃣ JAGGED ARRAY
        // =========================
        System.out.println("Jagged Array:");
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        int[][] jagged = new int[r][];

        for (int i = 0; i < r; i++) {
            System.out.print("Enter size of row " + i + ": ");
            int size = sc.nextInt();
            jagged[i] = new int[size];

            System.out.println("Enter elements:");
            for (int j = 0; j < size; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged Array elements:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
