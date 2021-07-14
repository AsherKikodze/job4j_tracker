package ru.job4j.tracker;
import java.util.ArrayList;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> findAll() {
        return items;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> found = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                found.add(item);
            }
        }
        return found;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                item.setId(id);
                items.remove(i);
                items.add(item);
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}