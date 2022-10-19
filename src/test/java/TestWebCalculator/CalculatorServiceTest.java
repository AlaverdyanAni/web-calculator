package TestWebCalculator;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.webcalculator.service.CalculatorService;
import pro.sky.java.course2.webcalculator.service.CalculatorServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ConstantsWebCalculator.CalculatorTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorServiceImpl();
    @Test
    void shouldReturnSum() {
        String result1 = out.plus(NUM1, NUM2);
        assertEquals(ResultSUM1, result1);
        String result2 = out.plus(NUM3, NUM4);
        assertEquals(ResultSUM2, result2);
    }
    @Test
    void shouldReturnDifference() {
        String result1 = out.minus(NUM1, NUM2);
        String result2 = out.minus(NUM3, NUM4);
        assertEquals(ResultDIFFERENCE1, result1);
        assertEquals(ResultDIFFERENCE2, result2);
    }

    @Test
    void shouldReturnMultiply() {
        String result1 = out.multiply(NUM1, NUM2);
        String result2 = out.multiply(NUM3, NUM4);
        assertEquals(ResultMULTIPLY1, result1);
        assertEquals(ResultMULTIPLY2, result2);
    }
    @Test
    void shouldDivide(){
        String result1=out.divide(NUM5,NUM1);
        String result2=out.divide(NUM6,NUM3);
        String result3=out.divide(NUM1,NUM7);
        assertEquals(ResultDIVIDE1,result1);
        assertEquals(ResultDIVIDE2,result2);
    }
    @Test
    void throwExceptionDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(NUM1, NUM7));
    }
}
    
