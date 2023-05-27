package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public class Bow implements GameWeapon {
    
    @Override
    public void shot() {
        
        System.out.println("Shot from - "+ this.getClass().getSimpleName());
    }
}
