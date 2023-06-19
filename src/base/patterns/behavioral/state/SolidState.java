
package base.patterns.behavioral.state;

public class SolidState implements IState {
    
    private static final String NAME = "solid";

    @Override
    public String getName() {

        return NAME;
    }

    @Override
    public void freeze(StateContext context) {

        System.out.println("Nothing happens.");
    }

    @Override
    public void heat(StateContext context) {

        context.setState(new LiquidState());
    }
}
