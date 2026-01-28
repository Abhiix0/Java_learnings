public class OperatorsDemo {
    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic:");
        System.out.println(x + y); // addition
        System.out.println(x - y); // subtraction
        System.out.println(x * y); // multiplication
        System.out.println(x / y); // division
        System.out.println(x % y); // modulus

        // 2. Assignment Operators
        System.out.println("\nAssignment:");
        int a = 5;
        a += 3;
        a -= 2;
        a *= 2;
        a /= 2;
        System.out.println(a);

        // 3. Relational (Comparison) Operators
        System.out.println("\nRelational:");
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        // 4. Logical Operators
        System.out.println("\nLogical:");
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println(cond1 && cond2);
        System.out.println(cond1 || cond2);
        System.out.println(!cond1);

        // 5. Unary Operators
        System.out.println("\nUnary:");
        int n = 5;
        System.out.println(++n);
        System.out.println(--n);
        System.out.println(-n);


        // 6. Operator Precedence (PEMDAS)
        System.out.println("\nPrecedence:");
        double value = 2 + 4 * (9 - 5) / 2.0;
        System.out.println(value);
    }
}
