package com.openclassrooms.testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test public void shouldAddTwoPositiveNumbers() {
        // arrange
        Integer expected = 3;
        Calculator calculator = new Calculator();

        // act
        Integer sum = calculator.add(1, 2);

        // assert
        assertEquals(expected, sum);
    }

    @Test public void shouldMultiplyTwoPositiveNumbers() {
        Integer expected = 15;
        Calculator calculator = new Calculator();

        Integer product = calculator.times(3, 5);

        // assertEquals(expected, product);
        assertThat(product, is(expected));
    }
}
