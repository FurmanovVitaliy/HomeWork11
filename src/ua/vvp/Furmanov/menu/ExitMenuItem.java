package ua.vvp.Furmanov.menu;

import ua.vvp.Furmanov.menu.base.MenuItem;

public class ExitMenuItem extends MenuItem {


    public ExitMenuItem() {
        super("Exit", true);
    }

    @Override
   public void exec() {
        System.out.println("Bye.");
    }
}
