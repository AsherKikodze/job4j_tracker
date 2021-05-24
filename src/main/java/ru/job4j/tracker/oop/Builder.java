package ru.job4j.tracker.oop;

public class Builder extends Engineer {
    public int electricityLevel;

    public Builder(int level) {
        this.electricityLevel = level;
    }

    public int getElectricityLevel() {
        return electricityLevel;
    }
}
