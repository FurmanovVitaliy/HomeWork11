package ua.vvp.Furmanov.ui;

import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.humanService.HumanService;
import ua.vvp.Furmanov.utils.HumanList;

import java.util.Scanner;

public class UI {
    private Scanner sc;

    public UI (Scanner sc){
        this.sc = sc;
    }
    HumanList humans = new HumanList();

    public HumanList readHumans (int count){
        for (int i = 0; i <count ; i++) {
            humans.add(readHuman());
        }
        return humans;
    }

    private Human readHuman() {
        System.out.println("Enter person");
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter surname");
        String surname = sc.nextLine();
        System.out.println("Enter ppatronymic");
        String patronymic = sc.nextLine();
        return new Human(name,surname,patronymic);
    }



}
