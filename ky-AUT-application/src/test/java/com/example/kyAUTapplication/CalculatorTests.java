package com.example.kyAUTapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {


    private Calculator calculator = new Calculator();

    @DisplayName("Test adding two numbers")
    @Test
    void testAdd() {
        Assertions.assertEquals(8, calculator.add(3, 5));
    }

    @DisplayName("Test subtracting two numbers")
    @Test
    void testSubtract() {
        Assertions.assertEquals(7, calculator.subtract(10, 3));
    }

    @DisplayName("Test multiplying two numbers")
    @Test
    void testMultiply() {
        Assertions.assertEquals(15, calculator.multiply(3, 5));
    }

    @DisplayName("Test dividing two integers")
    @Test
    void testDivide() {
        Assertions.assertEquals(5, calculator.divide(25, 5));
    }

    @DisplayName("Test dividing with decimal answer")
    @Test
    void testDivideWithDecimals() {
        Assertions.assertEquals(3.5714285714285716, calculator.divide(25, 7));
    }

    @DisplayName("Test square root")
    @Test
    void testSquareRoot() {
        Assertions.assertEquals(2, calculator.squareRootOf(4));
    }

    @DisplayName("Test area calculations")
    @Test
    void testGetAreaAreaIsCorrect() {
        Assertions.assertEquals(78.54, calculator.getArea(5));
    }

    @DisplayName("Test area calculations with negative input")
    @Test
    void testGetAreaReturnNaNWithNegativeInput() {
        Assertions.assertEquals(Double.NaN, calculator.getArea(-3));
    }

    @DisplayName("Test circumference")
    @Test
    void testCircumference() {
        Assertions.assertEquals(18.85, calculator.getCircumference(3));
    }

    @DisplayName("Test circumference with negative input")
    @Test
    void testCircumferenceReturnNaNWithNegativeInput() {
        Assertions.assertEquals(Double.NaN, calculator.getCircumference(-1));
    }
}



