package Oops;

public class GameCharacter {
    String name;
    int health;
    String power;

    GameCharacter(String name, int health, String power){
        this.name = name;
        this.health = health;
        this.power = power;
    }

    void attack(){
        health -= 200;
        System.out.println(name + " attacks the beast with " + power);
    }

    void heal(){
        health += 300;
        System.out.println(name + " is healing");
    }

    void showStatus(){
        System.out.println(name);
        System.out.println(name + " health " + health);
        System.out.println(name +"'s ability is "+ power);
        System.out.println("--------------------");
    }

    public static void main(String[] args){
        GameCharacter gc1 = new GameCharacter("AbhiX0",2000,"Time control");
        GameCharacter gc2 = new GameCharacter("Reaperx1",3000,"Instant Death");

        System.out.println("your characters");
        gc1.showStatus();
        gc2.showStatus();
        System.out.println("A wild beast appears and attacks "+ gc2.name);
        gc1.attack();
        gc2.heal();
        System.out.println(gc2.name + " finishes the beast with " + gc2.power);

    }
}
