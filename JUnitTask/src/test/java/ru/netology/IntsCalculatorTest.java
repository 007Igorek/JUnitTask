package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntsCalculatorTest {
    @Test
    void sum() {
        Ints intsCalc = new IntsCalculator();

        Assertions.assertEquals(7, intsCalc.sum(7, 0));
        Assertions.assertEquals(-5, intsCalc.sum(-7, 2));
        Assertions.assertEquals(0, intsCalc.sum(1, -1));
    }

    @Test
    void mult() {
        Ints intsCalc = new IntsCalculator();

        Assertions.assertEquals(21, intsCalc.mult(3, 7));
        Assertions.assertEquals(0, intsCalc.mult(2, 0));
        Assertions.assertEquals(21, intsCalc.mult(-3, -7));
    }

    @Test
    void pow() {
        Ints intsCalc = new IntsCalculator();

        Assertions.assertEquals(4, intsCalc.pow(2, 2));
        Assertions.assertEquals(1024, intsCalc.pow(2, 10));
        Assertions.assertEquals(1, intsCalc.pow(2, 0));
    }
}
