package com.openclassrooms.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddTwoPositiveNumbers() {

        // arrange
        Integer expected = 3;
        Calculator calculator = new Calculator();

        // act
        Integer sum = calculator.add(1, 2);

        // assert
        assertEquals(expected, sum);
    }
}
