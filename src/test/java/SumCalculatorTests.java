import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTests {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void sumWorksCorrectTest() {
        Assertions.assertEquals(3, calculator.sum(2));
        Assertions.assertEquals(6, calculator.sum(3));
        Assertions.assertEquals(15, calculator.sum(5));
    }

    @Test
    public void sumThrowsExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
