package TestWebCalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.webcalculator.service.CalculatorService;
import pro.sky.java.course2.webcalculator.service.CalculatorServiceImpl;

import static ConstantsWebCalculator.CalculatorTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class CalculatorServiceImplParamTest {
    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, ResultSUM1),
                Arguments.of(NUM3, NUM4, ResultSUM2));
    }
    public static Stream<Arguments> provideParamsForDifferenceTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, ResultDIFFERENCE1),
                Arguments.of(NUM3, NUM4, ResultDIFFERENCE2));
    }
    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, ResultMULTIPLY1),
                Arguments.of(NUM3, NUM4, ResultMULTIPLY2));
    }
    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(NUM5, NUM1, ResultDIVIDE1),
                Arguments.of(NUM6, NUM3, ResultDIVIDE2));
    }
    private final CalculatorService out= new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    public void shouldReturnSum(double num1,double num2, String expectedSum){
        String result = out.plus(num1,num2);
        assertEquals(expectedSum,result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDifferenceTests")
    public void shouldReturnDifference(double num1,double num2, String expectedDifference){
        String result = out.minus(num1,num2);
        assertEquals(expectedDifference,result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldReturnMultiply(double num1,double num2, String expectedMultiply){
        String result = out.multiply(num1,num2);
        assertEquals(expectedMultiply,result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldReturnDivide(double num1,double num2, String expectedDivide) {
        String result = out.divide(num1, num2);
        assertEquals(expectedDivide, result);
    }
}


