
package base.patterns.behavioral.state;

public class LiquidState implements IState {
    
    private static final String NAME = "liquid";

    @Override
    public String getName() {

        return NAME;
    }

    @Override
    public void freeze(StateContext context) {

        context.setState(new SolidState());
    }

    @Override
    public void heat(StateContext context) {
        context.setState(new GaseousState());
    }
}
