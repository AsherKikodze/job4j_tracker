package ru.job4j.tracker.oop;

public class Programmer extends Engineer {
    public String[] languages;

    public Programmer(String[] lang) {
        this.languages = lang;

    }

    public String[] getLanguages() {
        return languages;
    }
}
