package by.itacademy.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    private Division division;
    private ArithmeticException arithmeticException;

    @Before
    public void setUp()  {
        division = new Division();
    }

    @Test
    public void testDivisionArithmeticOperation() {
        assertAll(
                "DivisionArithmeticOperation",
                () -> assertEquals(3, (division.performCalculation(3, 1)), "Division with positive numbers doesn't work"),
                () -> assertEquals(0, (division.performCalculation(0, 3)), "Division with zero and positive number doesn't work"),
                () -> assertEquals(-0.5, (division.performCalculation(1, -2)), "Division with positive number and negative number doesn't work"),
                () -> assertEquals(1, (division.performCalculation(-5, -5)), "Division with negative numbers doesn't work")
        );
    }

   @Test
   public void testDivisionByZeroArithmeticOperation() {
        assertThrows(ArithmeticException.class, () -> division.performCalculation(4, 0), "Division by zero doesn't work");
    }

    @Test
    public void testDivisionSign(){
        assertEquals("/", (division.getSign()), "Division sign is not  /");
    }
}