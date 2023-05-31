
package base.patterns.creational.prototype;

public class Cookie implements Cloneable {

    protected int calories;
    protected int weight;

    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        
        Cookie clone = (Cookie) super.clone();
        
        return clone;
    }
}
