package ui.commands;

import ui.View;

public class AddCommand implements  Commands{
    private View view;

    public AddCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addCommand();
    }

    @Override
    public String description() {
       return  "Добавить новую команду"+
               "1. собака"+
               "2. кошка"+
               "3. хомяк"+
               "4. лошадь"+
               "5. верблюд"+
               "6. осел";
    }
}
