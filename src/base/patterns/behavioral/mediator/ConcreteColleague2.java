
package base.patterns.behavioral.mediator;

public class ConcreteColleague2 extends AbstractColleague {

    public ConcreteColleague2(AbstractMediator mediator) {

        super(mediator);
    }

    @Override
    public void notify(String message) {

        System.out.println("Colleague2 gets message: "+ message);
    }
}
