package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public class CrossbowGenerator extends ShooterGenerator{
    
    @Override
    public IGameWeapon showWeapon() {
        
        return new Crossbow();
    }    
}
