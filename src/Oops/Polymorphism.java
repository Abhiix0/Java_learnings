package Oops;

// Polymorphism = "many forms"
// Ability of an object to take on many forms
// Two types: Method Overloading and Method Overriding

// Method Overloading Example (Compile-time polymorphism)
public class Polymorphism {

    // Same method name but different parameters
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    void add(String a, String b) {
        System.out.println("Concatenation: " + (a + b));
    }

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();

        // Compiler knows which method to call based on arguments
        poly.add(5, 10);                    // Calls add(int, int)
        poly.add(5.5, 10.5);                // Calls add(double, double)
        poly.add(5, 10, 15);                // Calls add(int, int, int)
        poly.add("Hello ", "World");        // Calls add(String, String)
    }
}

// Method Overriding Example (Runtime polymorphism)
// Uncomment below to see method overriding in action

/*
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();     // Dog reference as Animal
        Animal animal2 = new Cat();     // Cat reference as Animal

        animal1.sound();   // Calls Dog's sound() method
        animal2.sound();   // Calls Cat's sound() method
    }
}
*/
