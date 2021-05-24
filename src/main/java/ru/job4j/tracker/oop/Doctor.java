package ru.job4j.tracker.oop;

public class Doctor extends Profession {
    public boolean stateLicense;
    public String[] patientArray;

    public boolean findPatient(String patientName) {
        boolean rsl = false;
        for (String i : patientArray) {
            if (i.equals(patientName)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
