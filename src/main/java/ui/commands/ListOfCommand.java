package ui.commands;

import ui.View;

public class ListOfCommand implements Commands{
    private View view;

    public ListOfCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.listOfCommand();
    }

    @Override
    public String description() {
        return "Увидеть список комманд,которое выполняет животное:" +
                "1. собака"+
                "2. кошка"+
                "3. хомяк"+
                "4. лошадь"+
                "5. верблюд"+
                "6. осел";
    }
}
