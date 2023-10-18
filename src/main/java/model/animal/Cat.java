package model.animal;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Animals{
    String name;
    List<String> commands;

    public Cat(){
        this(" ",null);
    }

    public Cat(String name, List<String> commands) {
        this.name = name;
        this.commands = commands;
        commands= new ArrayList<>();
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
