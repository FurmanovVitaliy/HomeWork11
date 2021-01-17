package ua.vvp.Furmanov.menu.base;

import ua.vvp.Furmanov.menu.base.MenuItem;
import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private MenuItem[] items;

    public Menu(Scanner sc, MenuItem[] items) {
        this.sc = sc;
        this.items = items;
    }

    public void run(){
        while (true){
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].getName());
            }
            int choice = sc.nextInt();
            sc.nextLine();
            items[choice].exec();
        }
    }
}