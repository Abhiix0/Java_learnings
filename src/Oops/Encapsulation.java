package Oops;

// Encapsulation = Bundling data (variables) and methods into a single unit (class)
// AND controlling access using private/public access modifiers
// Data hiding + controlled access through getters and setters

public class Encapsulation {

    // Student class with proper encapsulation
    static class Student {
        // Private variables - data hiding
        private String name;
        private int age;
        private double gpa;
        private long studentId;

        // Constructor
        Student(String name, int age, double gpa, long studentId) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.studentId = studentId;
        }

        // Getter methods - reading data
        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

        double getGpa() {
            return gpa;
        }

        long getStudentId() {
            return studentId;
        }

        // Setter methods - modifying data with validation
        void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
                System.out.println("Name updated to: " + name);
            } else {
                System.out.println("Invalid name!");
            }
        }

        void setAge(int age) {
            if (age > 0 && age < 100) {
                this.age = age;
                System.out.println("Age updated to: " + age);
            } else {
                System.out.println("Invalid age! Must be between 1 and 100");
            }
        }

        void setGpa(double gpa) {
            if (gpa >= 0 && gpa <= 4.0) {
                this.gpa = gpa;
                System.out.println("GPA updated to: " + gpa);
            } else {
                System.out.println("Invalid GPA! Must be between 0 and 4.0");
            }
        }

        // StudentId is read-only (no setter) - immutable
        void displayInfo() {
            System.out.println("\n=== Student Info ===");
            System.out.println("ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Abhi", 20, 3.8, 101);

        // Access data through getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student GPA: " + student.getGpa());

        // Modify data through setters (with validation)
        student.setName("Abhishek");
        student.setAge(21);
        student.setGpa(3.9);

        // Try to set invalid values
        System.out.println("\nTrying invalid values:");
        student.setAge(150);  // Invalid
        student.setGpa(5.0);  // Invalid
        student.setName("");  // Invalid

        student.displayInfo();

        // Cannot directly access private members (these would cause errors):
        // student.name = "Hacker";  // COMPILE ERROR
        // student.gpa = 10.0;       // COMPILE ERROR
    }
}

// Benefits of Encapsulation:
// 1. Data Security: External code cannot directly modify private data
// 2. Control: Validation can be added in setters
// 3. Flexibility: Internal implementation can change without affecting external code
// 4. Maintainability: Easier to debug and understand
