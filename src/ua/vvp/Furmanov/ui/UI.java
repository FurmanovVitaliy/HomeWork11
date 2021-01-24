package ua.vvp.Furmanov.ui;

import ua.vvp.Furmanov.entities.Human;


public interface UI {
    Human addHuman();

    void addHumans();

    void showList();

    void searchByName();

    void remove();
}
