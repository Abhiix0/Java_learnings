package Oops;

import java.sql.SQLOutput;

public class Car {
    //Object =  A Real world Entity that holds data (attributes)
    //          and can perform actions (Methods)

      String Make = "Porsche";
      String Model = "911";
      int speed = 179;

      void start(){
          System.out.println("You started!");
      }
      void stop(){
          System.out.println("You stopped!");
      }

    public static void main(String[] args){
        Car car = new Car();

        System.out.println(car.Make);
        System.out.println(car.Model);
        System.out.println(car.speed);
        car.start();
        car.stop();


    }
}
