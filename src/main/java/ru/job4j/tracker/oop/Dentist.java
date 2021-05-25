package ru.job4j.tracker.oop;

public class Dentist extends Doctor {
    public int workingHours;

    public Dentist(int workingHours,
                   boolean stateLicense,
                   String[] patientArray,
                   String name,
                   String surname,
                   String edication,
                   String birthday
                    ) {
        super(stateLicense, patientArray, name, surname, edication, birthday);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
