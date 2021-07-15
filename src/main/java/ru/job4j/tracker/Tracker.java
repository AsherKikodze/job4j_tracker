package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int k = indexOf(id);
        return k > -1 ? items.get(k) : null;
    }

    public List<Item> findAll() {
         return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> found = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                found.add(item);
            }
        }
        return found;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int k = indexOf(id);
        if (k > -1) {
            item.setId(id);
            items.set(k, item);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int k = indexOf(id);
        if (k > -1) {
            items.remove(k);
            rsl = true;
        }
        return rsl;
    }
}