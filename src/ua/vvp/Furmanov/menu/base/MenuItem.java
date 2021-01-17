package ua.vvp.Furmanov.menu.base;

public abstract class MenuItem {
    private String name;
    private boolean closeAfter;

    public MenuItem(String name) {
        this.name = name;
        this.closeAfter = false;
    }

    public MenuItem(String name, boolean closeAfter) {
        this.name = name;
        this.closeAfter = closeAfter;
    }

    public String getName() {
        return name;
    }

    protected abstract void exec();

    public boolean closeAfter() {
        return closeAfter;
    }
}
