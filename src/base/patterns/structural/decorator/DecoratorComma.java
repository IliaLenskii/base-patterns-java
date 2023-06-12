
package base.patterns.structural.decorator;

public class DecoratorComma extends AbstractDecorator {
    
    public DecoratorComma(IComponent c) {
        
        super(c);
    }

    @Override
    public void doOperation() {
        
        System.out.print(",");

        super.doOperation();
    }	

    @Override
    public void newOperation() {
        
        System.out.println("New comma operation");
    }
}
