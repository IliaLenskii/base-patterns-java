package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public class Factory {
    
    public static void main(String[] args) {
        
        ShooterGenerator takeShotBow = new BowGenerator();
        
        takeShotBow.takeShot();
        
        ShooterGenerator takeShotCross = new CrossbowGenerator();
        
        takeShotCross.takeShot();
    }
}
