package ru.job4j.tracker.oop;

public class Student {

    public static void music() {
        System.out.println("Tra tra tra");
    }

    public static void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
