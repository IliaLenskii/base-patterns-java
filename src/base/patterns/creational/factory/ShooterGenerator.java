package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public abstract class ShooterGenerator {
    
    public void takeShot() {
        
        GameWeapon sh = showWeapon();
        sh.shot();
    }

    public abstract GameWeapon showWeapon();
}
