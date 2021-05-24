package ru.job4j.tracker.oop;

public class Profession {
    public String name;
    public String surname;
    public String edication;
    public String birthday;

    public Profession() {

    }

    public Profession(String name, String surname, String edication, String birthday) {
        this.name = name;
        this.surname = surname;
        this.edication = edication;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEdication() {
        return edication;
    }

    public String getBirthday() {
        return birthday;
    }
}
