
package base.patterns.creational.abstractfactory;


public class ToyotaFactory implements ICarsFactory {

    @Override
    public ISedan createSedan() {

        return new ToyotaSedan();
    }

    @Override
    public ICoupe createCoupe() {

        return new ToyotaCoupe();
    }
    
}
