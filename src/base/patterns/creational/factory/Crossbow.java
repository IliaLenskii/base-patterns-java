package base.patterns.creational.factory;

/**
 *
 * @author il.lenskii
 */
public class Crossbow implements IGameWeapon {
    
    @Override
    public void shot() {
        
        System.out.println("Shot from - "+ this.getClass().getSimpleName());
    }
}
