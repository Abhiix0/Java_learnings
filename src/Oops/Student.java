package Oops;

public class Student {
    //Constructor is used to initialize the objects.
    // we can pass arguments and set up initial values
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa){
    this.name = name;
    this.age = age;
    this.gpa = gpa;
    }
    public static void main(String[] args){
    Student student1 = new Student("Aarav",19,9.0);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
    }
    //Overloaded Constructors = Allow a class to have multiple constructors
    //                          with a diff parameter list
    //For example, a user class has a String username, email and wtv you can make'em like these
    //User(String username){
    //    this.username = username;
    //    this.email = "Not provided";
    //    this.age = 0;
    //}
    //
    //User(String username, String email){
    //    this.username = username;
    //    this.email = email;
    //    this.age = 0;
    //}
    //you can just use these
    //User user1 = new User("Spongebob");
    //User user2 = new User("Patrick", "PStar@aol.com");
    //User user3 = new User("Sandy", "SCheeks@gmail.com", 27);
}
