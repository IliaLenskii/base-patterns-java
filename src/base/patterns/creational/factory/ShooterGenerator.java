package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public abstract class ShooterGenerator {
    
    public void takeShot() {
        
        IGameWeapon sh = showWeapon();
        sh.shot();
    }

    public abstract IGameWeapon showWeapon();
}
