package ru.job4j.tracker.oop;

public class Surgeon extends Doctor {
    public String typeOfService;

    public Surgeon(String typeOfService,
                    String[] patientArray,
                    boolean stateLicense,
                    String name,
                    String surname,
                    String edication,
                    String birthday
                    ) {
        super(stateLicense, patientArray, name, surname, edication, birthday);
        this.typeOfService = typeOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }
}
