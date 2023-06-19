
package base.patterns.behavioral.state;

public interface IState {
    
    String getName();

    void freeze(StateContext context);

    void heat(StateContext context);
}
