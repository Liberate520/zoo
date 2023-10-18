package ui.commands;

import ui.View;

public class AddAnimals implements Commands{

    private View view;

    public AddAnimals(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addAnimals();

    }

    @Override
    public String description() {
        return "Завести новое животное:" +
                "1. собака"+
                "2. кошка"+
                "3. хомяк"+
                "4. лошадь"+
                "5. верблюд"+
                "6. осел";
    }
}
