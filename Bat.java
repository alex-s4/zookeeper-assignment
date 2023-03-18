/**
 * Bat
 */
public class Bat extends Mammal {

    // Bat's energy level is higher than most mammals
    Bat(){
        super.energy = 300;
    }

    public void fly(){
        System.out.println("**flap**,**flap**,**flap**");
        this.energy -= 50;
    }

    public void eatHumans(){
        this.energy += 25;
    }

    public void attackTown(){
        System.out.println("The town is on fire! **cry** **cry**");
        this.energy -= 100;
    }
}