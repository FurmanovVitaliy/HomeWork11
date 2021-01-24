package ua.vvp.Furmanov.menu;

import ua.vvp.Furmanov.Controller;
import ua.vvp.Furmanov.menu.base.MenuItem;

public class AddHumanItem extends MenuItem {
private Controller controller;

    public AddHumanItem(Controller controller) {
        super("Add Human");
        this.controller = controller;
    }

    @Override
    public void exec() {
        controller.add();
    }
}