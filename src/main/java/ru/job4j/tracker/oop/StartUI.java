package ru.job4j.tracker.oop;

import ru.job4j.tracker.Item;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime current = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String curr = current.format(formatter);
        System.out.println(curr);
    }
}