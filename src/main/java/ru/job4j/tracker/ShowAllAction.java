package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

     @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        ArrayList<Item> items = tracker.findAll();
        if (items.size() > 0) {
            for (Item i : items) {
                out.println(i);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
