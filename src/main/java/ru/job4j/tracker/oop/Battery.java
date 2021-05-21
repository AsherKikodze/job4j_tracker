package ru.job4j.tracker.oop;

public class Battery {
    public int charge;

    public Battery(int charge) {
        this.charge = charge;
    }

    public void exchange(Battery another) {
        another.charge += this.charge;
        this.charge = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(10);
        System.out.println("First battery charge = " + first.charge);
        System.out.println("Second battery charge = " + second.charge);
        first.exchange(second);
        System.out.println("=======");
        System.out.println("First battery charge = " + first.charge);
        System.out.println("Second battery charge = " + second.charge);
    }
}
