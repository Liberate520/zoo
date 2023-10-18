package presenter;

import model.service.Service;
import ui.View;

public class Presenter {
    private View view;
    private final Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addAnimals(String name){
        service.add(name);
    }

    public void addCommand(String name){
        service.addCommand();
    }

    public void counter(){
        service.counter();
    }

    public  void listOfCommand(String name){
        service.listOfCommand();
    }
}
