public class scopeDemo {

    static int globalVar = 100;   // class (global) scope

    static void showScope() {
        int methodVar = 50;       // method scope
        System.out.println("Method variable: " + methodVar);
        System.out.println("Global variable: " + globalVar);
    }

    public static void main(String[] args) {

        int localVar = 10;        // local (main) scope
        System.out.println("Local variable: " + localVar);
        System.out.println("Global variable: " + globalVar);

        // block scope
        if (localVar > 5) {
            int blockVar = 5;     // block scope
            System.out.println("Block variable: " + blockVar);
        }

        showScope();

        // ❌ This would cause error if uncommented
        // System.out.println(blockVar);
        // System.out.println(methodVar);
    }
}
