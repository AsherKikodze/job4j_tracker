package ru.job4j.tracker.encapsulation;

public class Config {
    protected String name;
    protected int position;
    protected String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    public String search(String key) {
        return key;
    }
}
