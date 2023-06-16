
package base.patterns.behavioral.mediator;

public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {

        this.mediator = mediator;
    }

    public void send(String message) {

        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
