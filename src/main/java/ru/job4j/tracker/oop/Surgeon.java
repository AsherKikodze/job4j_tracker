package ru.job4j.tracker.oop;

public class Surgeon extends Doctor {
    public String typeOfService;

    public Surgeon(String typeOfService,
                    String[] patientArray,
                    String name,
                    String surname,
                    String edication,
                    String birthday
                    ) {
        super.patientArray = patientArray;
        super.name = name;
        super.surname = surname;
        super.edication = edication;
        super.birthday = birthday;
        this.typeOfService = typeOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }
}
