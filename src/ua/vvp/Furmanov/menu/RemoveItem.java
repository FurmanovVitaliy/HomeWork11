package ua.vvp.Furmanov.menu;

import ua.vvp.Furmanov.Controller;
import ua.vvp.Furmanov.menu.base.MenuItem;

public class RemoveItem extends MenuItem {
    private Controller controller;

    public RemoveItem(Controller controller) {
        super("Remove Human");
        this.controller = controller;
    }

    @Override
    public void exec() {
        controller.remove();
    }
}