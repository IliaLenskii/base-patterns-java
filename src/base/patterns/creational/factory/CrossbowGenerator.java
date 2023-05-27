package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public class CrossbowGenerator extends ShooterGenerator{
    
    @Override
    public GameWeapon showWeapon() {
        
        return new Crossbow();
    }    
}
