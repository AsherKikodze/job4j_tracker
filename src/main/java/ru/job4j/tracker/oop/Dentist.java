package ru.job4j.tracker.oop;

public class Dentist extends Doctor {
    public String adress;
    public int workingHoursStart;
    public int workingHoursEnd;

    public String getAdress() {
        return adress;
    }

    public int getWorkingHoursStart() {
        return workingHoursStart;
    }

    public int getWorkingHoursEnd() {
        return workingHoursEnd;
    }
}
