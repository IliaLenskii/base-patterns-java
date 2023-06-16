
package base.patterns.behavioral.mediator;

public class ConcreteColleague1 extends AbstractColleague {
    
    public ConcreteColleague1(AbstractMediator mediator) {
        
        super(mediator);
    }

    @Override
    public void notify(String message) {

        System.out.println("Colleague1 gets message: "+ message);
    }
}
