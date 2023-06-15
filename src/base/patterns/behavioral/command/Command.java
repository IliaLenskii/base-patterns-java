
package base.patterns.behavioral.command;

public class Command {
    
    public static void main(String[] args) {

        Light lamp = new Light();

        // Since java 8
        //ICommand switchOn = lamp::turnOn;
        //ICommand switchOff = lamp::turnOff;
        
        ICommand switchOn = new SwitchOnCommand(lamp);
        ICommand switchOff = new SwitchOffCommand(lamp);

        Switch mySwitch = new Switch();

        mySwitch.register("on", switchOn);
        mySwitch.register("off", switchOff);

        mySwitch.execute("on");
        mySwitch.execute("off");        
    }
    
}
