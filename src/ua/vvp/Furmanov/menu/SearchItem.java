package ua.vvp.Furmanov.menu;

import ua.vvp.Furmanov.Controller;
import ua.vvp.Furmanov.menu.base.MenuItem;

public class SearchItem  extends MenuItem {
    private Controller controller;

    public SearchItem(Controller controller) {
        super("Search by name/surname ");
        this.controller = controller;
    }

    @Override
    public void exec() {
        controller.search();
    }
}