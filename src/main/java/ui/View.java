package ui;

import presenter.Presenter;

public interface View {
    public void addAnimals();

    public  void numberOfAnimals();

    public void listOfCommand();

    public void addCommand();

    public void setPresenter(Presenter presenter);

    public void start();
}
