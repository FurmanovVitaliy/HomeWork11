package ua.vvp.Furmanov.ui;

import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.humanService.HumanService;


import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements UI {


    private Scanner sc;
    private HumanService service;

    public ConsoleUI(Scanner sc, HumanService service) {
        this.sc = sc;
        this.service = service;
    }

    @Override
    public Human addHuman() {
        System.out.println("New person:");
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the surname: ");
        String surname = sc.nextLine();
        Human human = new Human(name, surname);

        return human;
    }

    @Override
    public void addHumans() {
        System.out.print("Enter quantity of new humans: ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            service.add(addHuman());
        }
    }

    @Override
    public void showList() {
        List<Human> humanList = service.getHumanList();
        for (int i = 0; i < humanList.size(); i++) {
            System.out.println((i+1)+ ". " + humanList.get(i));
        }
    }

    @Override
    public void searchByName() {
        System.out.print("Enter name to search: ");
        String nameToSearch = sc.nextLine();
        System.out.println("Result of search:");
        List<Human> result = service.searchByName(nameToSearch);
        for (int i = 0; i < result.size(); i++) {
            System.out.println((i + 1) + ". " + result.get(i));
        }
    }

    @Override
    public void remove() {
        System.out.println("Enter index of person to remove: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        service.remove(index);
    }
}
