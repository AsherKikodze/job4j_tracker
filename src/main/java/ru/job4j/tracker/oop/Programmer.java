package ru.job4j.tracker.oop;

public class Programmer extends Engineer {
    public String[] languages;

    public Programmer(String[] languages,
                      boolean autoCadExperience,
                      String[] coursesArray,
                      String name,
                      String surname,
                      String edication,
                      String birthday) {
        this.languages = languages;
        super.autoCadExperience = autoCadExperience;
        super.coursesArray = coursesArray;
        super.name = name;
        super.surname = surname;
        super.edication = edication;
        super.birthday = birthday;
    }

    public Programmer(String[] lang) {
        this.languages = lang;

    }

    public String[] getLanguages() {
        return languages;
    }
}
