package ua.vvp.Furmanov;

import ua.vvp.Furmanov.ui.UI;

import java.util.Scanner;

public class Controller {

    private UI ui;


    public Controller(UI ui) {
        this.ui = ui;
    }

    public void add() {
        ui.addHumans();
    }

    public void show() {
        ui.showList();
    }

    public void search() {
        ui.searchByName();
    }

    public void remove() {
        ui.remove();
    }


}

