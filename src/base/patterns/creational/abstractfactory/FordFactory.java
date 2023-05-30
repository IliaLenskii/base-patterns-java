
package base.patterns.creational.abstractfactory;


public class FordFactory implements ICarsFactory {

    @Override
    public ISedan createSedan() {

        return new FordSedan();
    }

    @Override
    public ICoupe createCoupe() {

        return new FordCoupe();
    }
}
