package ru.job4j.tracker.oop;

public class Builder extends Engineer {
    public int electricityLevel;

    public Builder(int electricityLevel,
                      boolean autoCadExperience,
                      String[] coursesArray,
                      String name,
                      String surname,
                      String edication,
                      String birthday) {
        super(autoCadExperience, coursesArray, name, surname, edication, birthday);
        this.electricityLevel = electricityLevel;
    }

    public int getElectricityLevel() {
        return electricityLevel;
    }
}
