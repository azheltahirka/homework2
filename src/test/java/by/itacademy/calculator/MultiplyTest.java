package by.itacademy.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplyTest {
    private Multiply multiply;

    @Before
    public void setUp()  {
        multiply = new Multiply();
    }

    @Test
    public void testMultiplyArithmeticOperation() {
        assertAll(
                "MultiplyArithmeticOperation",
                () -> assertEquals(6, (multiply.performCalculation(2, 3)), "Multiply with positive numbers doesn't work"),
                () -> assertEquals(0, (multiply.performCalculation(0, 3)), "Multiply with zero and positive number doesn't work"),
                () -> assertEquals(0, (Math.abs(multiply.performCalculation(-6, 0))), "Multiply with negative number and zero doesn't work"),
                () -> assertEquals(-20, (multiply.performCalculation(5, -4)), "Multiply with positive number and negative number doesn't work"),
                () -> assertEquals(24, (multiply.performCalculation(-6, -4)), "Multiply with negative numbers doesn't work")
        );
    }

    @Test
    public void testMultiplySign(){
        assertEquals("*", (multiply.getSign()), "Multiply sign is not *");
    }
}