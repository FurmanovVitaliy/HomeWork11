package ua.vvp.Furmanov;

import ua.vvp.Furmanov.humanService.HumanService;
import ua.vvp.Furmanov.humanService.LocalHumanService;
import ua.vvp.Furmanov.menu.*;
import ua.vvp.Furmanov.menu.base.Menu;
import ua.vvp.Furmanov.menu.base.MenuItem;
import ua.vvp.Furmanov.ui.ConsoleUI;
import ua.vvp.Furmanov.ui.UI;


import java.util.Scanner;




public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HumanService service = new LocalHumanService();
        UI ui = new ConsoleUI(sc,service);
        Controller controller = new Controller(ui);

        MenuItem[] items = new MenuItem[]{
                new AddHumanItem(controller),
                new ShowItem(controller),
                new RemoveItem(controller),
                new SearchItem(controller),
                new ExitMenuItem()};
        Menu menu = new Menu(sc, items);
        menu.run();

    }
}