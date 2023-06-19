
package base.patterns.behavioral.state;

public class State {
    
    public static void main(String[] args) {
        
        StateContext context = new StateContext();

        context.heat();
        context.heat();
        context.heat();
        context.freeze();
        context.freeze();
        context.freeze();
    }
}
