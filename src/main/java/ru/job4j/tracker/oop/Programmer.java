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
        super(autoCadExperience, coursesArray, name, surname, edication, birthday);
        this.languages = languages;
    }

    public Programmer(String[] lang) {
        this.languages = lang;

    }

    public String[] getLanguages() {
        return languages;
    }
}
