
package base.patterns.behavioral.memento;

public class Originator {
    
    private String state;

    public void setState(String state) {

        this.state = state;
    }

    public String getState() {

        return state;
    }

    public RealityMemento saveState() {

        return new RealityMemento(state);
    }

    public void restoreState(RealityMemento memento) {

        this.state = memento.getState();
    }
}
