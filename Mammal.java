/**
 * Mammal
 */
public class Mammal {

    // Default energy level for every Mammal class is 100
    int energy = 100;

    public int displayEnergy(){
        System.out.println(String.format("Energy level is: %d", this.energy));
        return this.energy;
    }
}