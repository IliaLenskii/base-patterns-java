
package base.patterns.behavioral.command;

public class SwitchOffCommand implements ICommand {
    
    private final Light light;

    public SwitchOffCommand(Light light) {

        this.light = light;
    }

    // Command
    @Override
    public void execute() {

        light.turnOff();
    }
}
