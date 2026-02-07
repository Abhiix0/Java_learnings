package Oops;

public class GameCharacter {
    private String name;
    private int health;
    private String power;

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public String getPower(){
        return power;
    }

    public void setHealth(int health){

        if (health >0){
            this.health = health;
        }
    }
    GameCharacter(String name, int health, String power){
        this.name = name;
        setHealth(health);
        this.power = power;
    }

    public void attack(){
        health -= 200;
        System.out.println(name + " attacks the beast with " + power);
    }

    public void heal(){
        health += 300;
        System.out.println(name + " is healing");
    }

    public void showStatus(){
        System.out.println(name);
        System.out.println(name + " health " + health);
        System.out.println(name +"'s ability is "+ power);
        System.out.println("--------------------");
    }

    static class Mage extends GameCharacter {

        Mage(String name, int health) {
            super(name, health, "Magic");
        }

        void castSpell() {
            System.out.println(getName() + " casts a spell!");
        }

        @Override
        public void attack() {
            setHealth(getHealth() - 100); // mage loses less health
            System.out.println(getName() + " casts a fireball 🪄");
        }

    }


    public static void main(String[] args){
        GameCharacter gc1 = new GameCharacter("AbhiX0",2000,"Time control");
        GameCharacter gc2 = new GameCharacter("Reaperx1",3000,"Instant Death");
        Mage gc3 = new Mage("Luciferx2",2433);
        System.out.println("your characters");
        gc1.showStatus();
        gc2.showStatus();
        gc3.showStatus();
        System.out.println("A wild beast appears and attacks "+ gc2.getName());
        gc1.attack();
        gc2.heal();
        System.out.println(gc2.getName() + " finishes the beast with " + gc2.getPower());
        System.out.println("wild Beasts appears");
        gc3.castSpell();
        System.out.println("One beast Left");
        gc3.attack();
        System.out.println("Wild beasts Died");
    }
}
