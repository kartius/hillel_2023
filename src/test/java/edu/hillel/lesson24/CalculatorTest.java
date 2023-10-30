package edu.hillel.lesson24;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {

    private MathOperationsService mathOperationsServiceMock =
            Mockito.mock(MathOperationsService.class);

    private MathOperationsService mathOperationsServiceSpy =
            Mockito.spy(MathOperationsService.class);


    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator(mathOperationsServiceMock);
    }

    @Test
    public void testSumNumbers() {
        assertEquals("TestSumNumbers was failed", 2, calculator.sum(1, 1));
    }


    @Test
    public void testSumBigNumbers() {
        assertEquals("TestSumNumbers was failed", 20000, calculator.sum(10000, 10000));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivadingNumbers() {
        assertEquals(2, calculator.divide(4, 0));
    }

    @Test
    public void testExternalOperation() {
        Mockito.when(mathOperationsServiceMock.operation(Mockito.anyInt(), Mockito.anyInt())).thenReturn(5);
        assertEquals(10, calculator.externalOperation(2, 2));
        Mockito.verify(mathOperationsServiceMock, Mockito.times(1)).operation(Mockito.anyInt(), Mockito.anyInt());
    }

    @Test
    public void testExtrnalOperationSpy() {
        calculator = new Calculator(mathOperationsServiceSpy);
        assertEquals(10, calculator.externalOperation(2, 2));
        Mockito.verify(mathOperationsServiceSpy, Mockito.times(1)).operation(2, 2);
    }
}
