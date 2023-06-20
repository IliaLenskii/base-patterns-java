
package base.patterns.behavioral.strategy;

public class Strategy {
    
    public static void main(String[] args) {
        
        Context context = new Context();
 
        context.setStrategy(new ConcreteStrategyAdd());

        System.out.println("A >> "+ context.executeStrategy(3, 4));
 
        context.setStrategy(new ConcreteStrategySubtract());

        System.out.println("B >> "+ context.executeStrategy(3, 4));
 
        context.setStrategy(new ConcreteStrategyMultiply());

        System.out.println("C >> "+ context.executeStrategy(3, 4));
    }
}
