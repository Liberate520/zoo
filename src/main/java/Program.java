import model.animal.animals.Animal;
import model.service.Service;
import presenter.Presenter;
import ui.Console;
import ui.View;

public class Program {
    public static void main(String[] args) {
        AddAnimals<Animal> animals = new AddAnimals<>();
        View view = new Console();
        Service service = new Service(animals);

        Presenter presenter = new Presenter(view, service);
        view.start();

    }
}
