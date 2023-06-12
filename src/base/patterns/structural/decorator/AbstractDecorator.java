
package base.patterns.structural.decorator;

public abstract class AbstractDecorator implements IComponent {

    protected IComponent component;

    public AbstractDecorator (IComponent c) {

        component = c;
    }

    @Override
    public void doOperation() {

        component.doOperation();
    }

    public void newOperation() {

        System.out.println("Do Nothing");
    }
}
