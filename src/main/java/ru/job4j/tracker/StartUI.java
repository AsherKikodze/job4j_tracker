package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item itemOne = new Item("Name 1");
        Item itemTwo = new Item("Name 2");
        Item itemThree = new Item("Name 3");
        Item itemFour = new Item("Name 4");
        Item itemFive = new Item("Name 1");
        Tracker tracker = new Tracker();
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.add(itemThree);
        tracker.add(itemFour);
        tracker.add(itemFive);
        for (Item i:tracker.findAll()) {
            System.out.println(i.getId() + " - " + i.getName());
        }
        System.out.println("=======");
        for (Item i:tracker.findByName("Name 1")) {
            System.out.println(i.getId() + " - " + i.getName());
        }
    }
}
