package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = false;
        status = 0;
        message = "";
    }

    public void printInfo() {
        System.out.println("active - " + active);
        System.out.println("ststus - " + status);
        System.out.println("message - " + message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error(true, 2, "This message");
        error.printInfo();
    }
}
