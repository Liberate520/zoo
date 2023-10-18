package model.animal;

import java.util.ArrayList;
import java.util.List;

public class Dog implements Animals{
    String name;
    List<String> commands;

    public Dog(){
        this(" ",new ArrayList<>());
    }

    public Dog(String name, List<String> commands) {
        this.name = name;
        this.commands = commands;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addCommand(String newCommand) {
        commands.add(newCommand);
    }

    @Override
    public List<String> getCommandLis() {
        return commands;
    }
}
