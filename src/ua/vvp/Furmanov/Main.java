package ua.vvp.Furmanov;
import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.humanService.HumanService;
import ua.vvp.Furmanov.menu.ExitMenuItem;
import ua.vvp.Furmanov.menu.base.Menu;
import ua.vvp.Furmanov.menu.base.MenuItem;
import ua.vvp.Furmanov.ui.HumanUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        MenuItem [] items = new MenuItem[]{
                            new ExitMenuItem()};
        Menu menu = new Menu(sc,items);
        ///////////////
        HumanService service = new HumanService();
        List<Human> humans = new ArrayList<>();
        HumanUI ui = new HumanUI(sc1,num);
        ui.addHumans(humans);
        ui.showList(humans);
        ui.searchByName(service,humans);
        ui.remove(humans);
        ui.showList(humans);



    }
}