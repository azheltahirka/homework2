package by.itacademy.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubtractionTest {
    private Subtraction subtraction;

    @Before
    public void setUp() throws Exception {
        subtraction = new Subtraction();
    }

    @Test
    public void testSubtractionArithmeticOperation() {
        assertAll(
                "SubtractionArithmeticOperation",
                () -> assertEquals(4, (subtraction.performCalculation(7, 3)), "Subtraction with positive numbers doesn't work"),
                () -> assertEquals(-3, (subtraction.performCalculation(0, 3)), "Subtraction with zero and positive number doesn't work"),
                () -> assertEquals(-1, (subtraction.performCalculation(-1, 0)), "Subtraction with negative number and zero doesn't work"),
                () -> assertEquals(7, (subtraction.performCalculation(1, -6)), "Subtraction with positive number and negative number doesn't work"),
                () -> assertEquals(4, (subtraction.performCalculation(-1, -5)), "Subtraction with negative numbers doesn't work")
        );
    }

    @Test
    public void testSubtractionSign() {
        assertEquals("-", (subtraction.getSign()), "Subtraction sign is -");
    }
}