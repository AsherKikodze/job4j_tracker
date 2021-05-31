package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                for (Item item: tracker.findAll()) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("=== Edit Item ID = " + id + " ====");
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                boolean res = tracker.replace(id, newItem);
                if (res) {
                    System.out.println("Edit successfull");
                } else {
                    System.out.println("Edit failed");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                int id = Integer.valueOf(scanner.nextLine());
                boolean res = tracker.delete(id);
                if (res) {
                    System.out.println("Delete successfull");
                 } else {
                    System.out.println("Delete failed");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ====");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item res = tracker.findById(id);
                if (res == null) {
                    System.out.println("Id not valid");
                } else {
                    System.out.println(res);
                }
            } else if (select == 5) {
                System.out.println("=== Find Item by Name ====");
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                Item[] foundItem = tracker.findByName(name);
                if (foundItem.length > 0) {
                    for (Item i : foundItem) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("Items not found");
                }
            } else {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
