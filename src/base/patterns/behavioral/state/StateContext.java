
package base.patterns.behavioral.state;

public class StateContext {
    
    private IState state = new SolidState();

    public void freeze() {

        System.out.println("Freezing " + state.getName() + " substance...");

        state.freeze(this);
    }

    public void heat() {

        System.out.println("Heating " + state.getName() + " substance...");

        state.heat(this);
    }

    public void setState(IState state) {
        
        System.out.println("Changing state to " + state.getName() + "...");

        this.state = state;
    }

    public IState getState() {

        return state;
    }
}
