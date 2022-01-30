package by.itacademy.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {
    private Addition addition;

    @Before
    public void setUp() {
        addition = new Addition();
    }

    @Test
    public void testAdditionArithmeticOperation() {
        assertAll(
                "AdditionArithmeticOperation",
                () -> assertEquals(4, (addition.performCalculation(1, 3)), "Addition with positive numbers doesn't work"),
                () -> assertEquals(3, (addition.performCalculation(0, 3)), "Addition with zero and positive number doesn't work"),
                () -> assertEquals(-1, (addition.performCalculation(-1, 0)), "Addition with negative number and zero doesn't work"),
                () -> assertEquals(-1, (addition.performCalculation(1, -2)), "Addition with positive number and negative number doesn't work"),
                () -> assertEquals(-4, (addition.performCalculation(-1, -3)), "Addition with negative numbers doesn't work")
        );
    }

    @Test
    public void testAdditionSign(){
        assertEquals("+", (addition.getSign()), "Addition sign is not +");
    }
}