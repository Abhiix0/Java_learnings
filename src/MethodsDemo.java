// method = A block of reusable code executed when called ()
public class MethodsDemo {

    // 1. Method with no parameters and no return type
    static void greet() {
        System.out.println("Hello, welcome!");
    }

    // OVERLOADED greet method (with parameter)
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 2. Method with parameters and no return type
    static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // OVERLOADED add method (3 parameters)
    static void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    // 3. Method with parameters and return value
    static int multiply(int a, int b) {
        return a * b;
    }

    // OVERLOADED multiply method (double type)
    static double multiply(double a, double b) {
        return a * b;
    }

    // 4. Method that returns boolean
    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    static void showDetails(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {

        greet();                 // calls greet()
        greet("Abhi");           // calls overloaded greet(String)

        add(5, 3);               // calls add(int, int)
        add(1, 2, 3);            // calls overloaded add(int, int, int)

        int result1 = multiply(4, 6);       // int version
        double result2 = multiply(2.5, 4);  // double version

        System.out.println(result1);
        System.out.println(result2);

        System.out.println(isEven(10));
        showDetails("Abhi", 19);

    }
}
