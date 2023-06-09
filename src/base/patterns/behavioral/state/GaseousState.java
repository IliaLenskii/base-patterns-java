
package base.patterns.behavioral.state;

public class GaseousState implements IState {
    
    private static final String NAME = "gaseous";

    @Override
    public String getName() {

        return NAME;
    }

    @Override
    public void freeze(StateContext context) {

        context.setState(new LiquidState());
    }

    @Override
    public void heat(StateContext context) {

        System.out.println("Nothing happens.");
    }
}
