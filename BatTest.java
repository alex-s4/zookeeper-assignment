/**
 * BatTest
 */
public class BatTest {

    public static void main(String[] args) {
        
        Bat batGuy = new Bat();

        for (int i = 0; i < 3; i++) { batGuy.attackTown(); }
        for (int i = 0; i < 2; i++) { batGuy.eatHumans(); }
        batGuy.fly();

        batGuy.displayEnergy();
    }
}