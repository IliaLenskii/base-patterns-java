
package base.patterns.behavioral.strategy;

public class ConcreteStrategyAdd implements IStrategy {
    
    @Override
    public int execute(int a, int b) {
        
        System.out.println("Called ConcreteStrategyAdd's execute()");
        
        return a + b;
    }
}
