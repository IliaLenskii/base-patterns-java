
package base.patterns.structural.decorator;

public class DecoratorSpace extends AbstractDecorator {

    public DecoratorSpace(IComponent c) {

        super(c);
    }

    @Override
    public void doOperation() {

        System.out.print(" ");

        super.doOperation();
    }

    @Override
    public void newOperation() {

        System.out.println("New space operation");
    }
}
