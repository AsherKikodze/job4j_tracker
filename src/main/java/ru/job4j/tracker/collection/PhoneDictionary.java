package ru.job4j.tracker.collection;
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person pers : persons) {
            String search = pers.getName()
                    + '\n' + pers.getSurname()
                    + '\n' + pers.getPhone()
                    + '\n' + pers.getAddress();
            if (search.contains(key)) {
                result.add(pers);
            }
            }
            return result;
         }
}