package app.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void initialize() {
        this.calc = new Calculator();
    }

    @Test
    public void test1() {
        int expected = 3;
        int actual = calc.calc(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int expected = 4;
        int actual = calc.calc(2, 2);
        assertEquals(expected, actual);
    }
}