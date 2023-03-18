
/**
 * Gorilla
 */
public class Gorilla extends Mammal{

    public void throwSomething(){
        System.out.println("Gorilla threw something!");
        super.energy -= 5;
    }

    public void eatBananas(){
        System.out.println("The gorilla is eating a banana, *yum yum*");
        super.energy += 10;
    }

    public void climb(){
        System.out.println("The gorilla is climbed a tree.");
        super.energy -= 10;
    }
}