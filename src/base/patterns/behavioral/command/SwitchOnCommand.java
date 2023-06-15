
package base.patterns.behavioral.command;

public class SwitchOnCommand implements ICommand {
    
    private final Light light;

    public SwitchOnCommand(Light light) {

        this.light = light;
    }

    // Command
    @Override
    public void execute() {

        light.turnOn();
    }
}
