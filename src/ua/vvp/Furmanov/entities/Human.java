package ua.vvp.Furmanov.entities;

public class Human {
    private String name;
    private String surname;
    private String patronymic;

    public Human(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+patronymic;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Human))return false;
        Human human = (Human)obj;
        return human.name.equals(name) && human.surname.equals(surname) && human.patronymic.equals(patronymic);
    }
}
