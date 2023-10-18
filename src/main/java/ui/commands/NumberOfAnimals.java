package ui.commands;

import ui.View;

public class NumberOfAnimals implements Commands{
    private View view;

    public NumberOfAnimals(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.numberOfAnimals();
    }

    @Override
    public String description() {
        return "Узнать количество животных:" +
                "1. собака"+
                "2. кошка"+
                "3. хомяк"+
                "4. лошадь"+
                "5. верблюд"+
                "6. осел";
    }
}
