package ru.job4j.tracker;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenManyValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"5","8","24"}
        );
        ValidateInput input = new ValidateInput(out, in);
        assertThat(input.askInt("Enter menu:"), is(5));
        assertThat(input.askInt("Enter menu:"), is(8));
        assertThat(input.askInt("Enter menu:"), is(24));
    }

    @Test
    public void whenInputMinus() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        assertThat(input.askInt("Enter menu:"), is(-1));
    }

}