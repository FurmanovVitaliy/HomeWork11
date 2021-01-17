package ua.vvp.Furmanov.ui;
import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.humanService.HumanService;
import ua.vvp.Furmanov.utils.HumanList;

import java.util.List;
import java.util.Scanner;

public class HumanUI {
    private Scanner sc;
    private Scanner num;

    public HumanUI(Scanner sc, Scanner num) {
        this.sc = sc;
        this.num = num;
    }

    public void addHumans(List<Human> humans) {
        System.out.print("Enter quantity of new humans: ");
        int count = num.nextInt();
        for (int i = 0; i < count; i++) {
            humans.add(addHuman());
        }
    }

    private Human addHuman() {

        System.out.println("To add new person");
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the surname: ");
        String surname = sc.nextLine();
        Human human = new Human(name, surname);
        return human;
    }

    public void showList(List<Human> humans) {
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(i+1+". " + humans.get(i));
        }
    }

    public void searchByName(HumanService search, List<Human> humans) {
        System.out.print("Enter name to search: ");
        String nameToSearch = sc.nextLine();
        System.out.println("Result of search:");
        showList(search.searchByName(nameToSearch, humans));
    }

    public void remove(List<Human> humanList){
        System.out.println("Enter index of person to remove: ");
        int index = num.nextInt()+1;
        humanList.remove(index);
    }
}
