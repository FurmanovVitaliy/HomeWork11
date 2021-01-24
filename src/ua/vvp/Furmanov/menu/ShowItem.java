package ua.vvp.Furmanov.menu;

import ua.vvp.Furmanov.Controller;
import ua.vvp.Furmanov.menu.base.MenuItem;

public class ShowItem extends MenuItem {
    private Controller controller;

    public ShowItem(Controller controller) {
        super("Show List");
        this.controller = controller;
    }

    @Override
    public void exec() {
        controller.show();
    }
}
