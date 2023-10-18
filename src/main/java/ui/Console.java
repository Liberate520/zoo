package ui;

import presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class Console implements View{

    private final Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work = true;

    public Console() {
        menu = new Menu(this);
       scanner = new Scanner(System.in);
    }
    public void start() {
        while (work) {
            System.out.println(menu.printMenu());
            int number = Integer.parseInt(scanner.nextLine());
            menu.execute(number);

        }
    }
    @Override
    public void addAnimals() {
        System.out.println("Выберите животное");
        int num = scanner.nextInt();
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        presenter.addAnimals(name);
    }

    @Override
    public void numberOfAnimals() {
        presenter.counter();
    }

    @Override
    public void listOfCommand() {
        System.out.println("Выберите животное");
        int num = scanner.nextInt();
        System.out.println("Введите имя животного");
        String name = scanner.nextLine();
        presenter.listOfCommand(name);
    }

    @Override
    public void addCommand() {
        System.out.println("Выберите животное");
        int num = scanner.nextInt();
        System.out.println("Введите имя животного");
        String name = scanner.nextLine();
        presenter.addCommand(name);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter=presenter;

    }
}
