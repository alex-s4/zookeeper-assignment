/**
 * GorillaTest
 */
public class GorillaTest {

    public static void main(String[] args) {
        
        /*
         * Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
         */

        Gorilla harambe = new Gorilla();

        for (int i = 0; i < 3; i++) { harambe.throwSomething(); }
        for (int i = 0; i < 2; i++) { harambe.eatBananas(); }
        harambe.climb();
        
        harambe.displayEnergy();
    }
}