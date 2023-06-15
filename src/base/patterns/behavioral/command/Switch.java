
package base.patterns.behavioral.command;

import java.util.HashMap;

public class Switch {

    private final HashMap<String, ICommand> commandMap = new HashMap<>();

    public void register(String commandName, ICommand command) {

        commandMap.put(commandName, command);
    }
    
    public void execute(String commandName) {

        ICommand command = commandMap.get(commandName);
        
        if (command == null)
            throw new IllegalStateException("no command registered for "+ commandName);

        command.execute();
    }
}
