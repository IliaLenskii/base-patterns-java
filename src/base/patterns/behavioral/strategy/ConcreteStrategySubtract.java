
package base.patterns.behavioral.strategy;

import base.patterns.creational.abstractfactory.ICarsFactory;

public class ConcreteStrategySubtract implements IStrategy {

    @Override
    public int execute(int a, int b) {
        
        System.out.println("Called ConcreteStrategySubtract's execute()");

        return a - b;  // Do a subtraction with a and b
    }
}
