import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    Calculator calculate;

    @BeforeEach
    void setUp() {
        calculate = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(7, calculate.add(3, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculate.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(20, calculate.multiply(4, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calculate.divide(5, 2), 0.0001);
    }

    @Test
    void testSquare() {
        assertEquals(16.0, calculate.square(4));
    }

    @Test
    void testSquareRoot() {
        assertEquals(5.0, calculate.squareRoot(25.0), 0.0001);
    }

    @Test
    public void testSquareRootOfNegativeNumber() {
        try {
            calculate.squareRoot(-9);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot take square root of a negative number.", e.getMessage());
        }
    }
}
