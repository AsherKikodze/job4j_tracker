package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.oop.StubInput;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(new ConsoleOutput()),
                new ExitAction()
        };
        new StartUI(new ConsoleOutput()).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        StubOutput st = new StubOutput();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(st),
                new ExitAction()
        };
        new StartUI(st).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        StubOutput st = new StubOutput();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(st),
                new ExitAction()
        };
        new StartUI(st).init(in, tracker, actions);
        //assertThat(tracker.findById(item.getId()), is(nullValue()));
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAllItem() {
        Tracker tracker = new Tracker();
        Output st = new StubOutput();
        /* Добавим в tracker новую заявку */
        Item item1 = tracker.add(new Item("First item"));
        Item item2 = tracker.add(new Item("Second item"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(st),
                new ExitAction()
        };
        new StartUI(st).init(in, tracker, actions);
        Assert.assertThat(st.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Show all items ====" + System.lineSeparator() +
                        item1 + System.lineSeparator() +
                        item2 + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Output st = new StubOutput();
        /* Добавим в tracker новую заявку */
        Item item1 = tracker.add(new Item("First item"));
        Item item2 = tracker.add(new Item("Second item"));
        Input in = new StubInput(
                new String[] {"0", item2.getName(), "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(st),
                new ExitAction()
        };
        new StartUI(st).init(in, tracker, actions);
        Assert.assertThat(st.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find items by name ====" + System.lineSeparator() +
                        item2 + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Output st = new StubOutput();
        /* Добавим в tracker новую заявку */
        Item item1 = tracker.add(new Item("First item"));
        Item item2 = tracker.add(new Item("Second item"));

        Input in = new StubInput(
                new String[] {"0", String.valueOf(item2.getId()), "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(st),
                new ExitAction()
        };
        new StartUI(st).init(in, tracker, actions);
        Assert.assertThat(st.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find item by id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find item by id ====" + System.lineSeparator() +
                        item2 + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find item by id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                )
        );
    }
}