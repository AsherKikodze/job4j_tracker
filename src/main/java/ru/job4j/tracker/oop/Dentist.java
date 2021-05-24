package ru.job4j.tracker.oop;

public class Dentist extends Doctor {
    public int workingHoursStart;
    public int workingHoursEnd;

    public Dentist(int workingHoursStart,
                   int workingHoursEnd,
                   String[] patientArray,
                   String name,
                   String surname,
                   String edication,
                   String birthday
    ) {
        this.workingHoursStart = workingHoursStart;
        this.workingHoursEnd = workingHoursEnd;
        super.patientArray = patientArray;
        super.name = name;
        super.surname = surname;
        super.edication = edication;
        super.birthday = birthday;
    }

    public int getWorkingHoursStart() {
        return workingHoursStart;
    }

    public int getWorkingHoursEnd() {
        return workingHoursEnd;
    }
}
