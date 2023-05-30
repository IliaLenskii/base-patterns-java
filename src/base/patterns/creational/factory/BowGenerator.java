package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public class BowGenerator extends ShooterGenerator {

    @Override
    public IGameWeapon showWeapon() {
        
        return new Bow();
    }    
}
