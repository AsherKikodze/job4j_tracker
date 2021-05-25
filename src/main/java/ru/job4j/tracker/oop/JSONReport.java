package ru.job4j.tracker.oop;

public class JSONReport extends TextReport {

        public String generate(String name, String body) {
            return name + " : " + name + System.lineSeparator() + body + " : " + body;
    }

    public static void main(String[] args) {
        JSONReport jsn = new JSONReport();
        String text = jsn.generate("name", "body");
        System.out.println(text);
    }
}
