package model.animal;

import java.util.ArrayList;
import java.util.List;

public class Hamster implements Animals{
    String name;
    List<String> commands;

    public Hamster(){
        this(" ",new ArrayList<>());
    }

    public Hamster(String name, List<String> commands) {
        this.name = name;
        this.commands = commands;
    }

    @Override
    public String getName() {
        return  this.name;
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
