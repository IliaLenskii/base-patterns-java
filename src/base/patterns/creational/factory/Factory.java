package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public class Factory {
    
    public static void main(String[] args) {

        ShooterGenerator takeWeapon = new CrossbowGenerator(); // BowGenerator
        IGameWeapon wg = takeWeapon.showWeapon();

        wg.shot();
    }
}
