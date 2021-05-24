package ru.job4j.tracker.oop;

public class Engineer extends Profession {
    public boolean autoCadExperience;
    public String[] coursesArray;

    public Engineer() {

    }

    public Engineer(boolean autoCadExperience,
                  String[] coursesArray,
                  String name,
                  String surname,
                  String edication,
                  String birthday) {
        this.autoCadExperience = autoCadExperience;
        this.coursesArray = coursesArray;
        super.name = name;
        super.surname = surname;
        super.edication = edication;
        super.birthday = birthday;
    }

    public boolean isAutoCadExperience() {
        return autoCadExperience;
    }
}
