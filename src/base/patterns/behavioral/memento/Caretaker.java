
package base.patterns.behavioral.memento;

public class Caretaker {

    private RealityMemento memento;

    public RealityMemento getMemento() {

        return memento;
    }

    public void setMemento(RealityMemento memento) {

        this.memento = memento;
    }
}
