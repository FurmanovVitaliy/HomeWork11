package ua.vvp.Furmanov.menu.base;

import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private MenuItem[] items;


    public Menu(Scanner sc, MenuItem[] items) {
        this.sc = sc;
        this.items = items;


    }


    public void run() {
        while (true) {
            stars();
            showAll();
            stars();
            int choice = getUserChoice();
            if (isChoiceValid(choice)) continue;
            items[choice].exec();
            if (items[choice].closeAfter()) break;
        }
    }

    private void stars() {
        System.out.println();
        System.out.println("*********************");
        System.out.println();
    }

    private boolean isChoiceValid(int choice) {
        if (choice < 0 || choice >= items.length) {
            System.out.println("Choice invalid");
            return true;
        }
        return false;
    }

    private int getUserChoice() {
        System.out.println("Enter your choice:");
        int choice = sc.nextInt() - 1;
        sc.nextLine();

        return choice;
    }


    private void showAll() {
        System.out.println("Choice one of the next");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i].getName());
        }
    }
}