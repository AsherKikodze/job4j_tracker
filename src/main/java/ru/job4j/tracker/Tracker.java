package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int k = indexOf(id);
        return k != -1 ? items[k] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] found = new Item[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                found[j] = items[i];
                j++;
            }
        }
        return Arrays.copyOf(found, j);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        Item it = findById(id);
        boolean rsl = false;
        if (it != null) {
            it.setName(item.getName());
            rsl = true;
        }
        return rsl;
    }

}