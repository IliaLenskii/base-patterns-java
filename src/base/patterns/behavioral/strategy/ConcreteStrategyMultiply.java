
package base.patterns.behavioral.strategy;

public class ConcreteStrategyMultiply implements IStrategy {
    
    public int execute(int a, int b) {

        System.out.println("Called ConcreteStrategyMultiply's execute()");

        return a * b;
    }
}
