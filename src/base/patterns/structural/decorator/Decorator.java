
package base.patterns.structural.decorator;

public class Decorator {

    public static void main(String[] args) {

        AbstractDecorator d = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));

        d.doOperation();
        d.newOperation();
    }
}