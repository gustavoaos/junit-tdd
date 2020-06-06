package com.openclassrooms.testing;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private static Instant startedAt;
    private Calculator calculator;

    @BeforeAll
    public static void beforeClass() {
        startedAt = Instant.now();

        System.out.println("Called only ONCE BEFORE ALL tests at " + startedAt);
    }

    @AfterAll
    public static void afterClass() {
        Instant endedAt = Instant.now();
        Duration duration = Duration.between(startedAt, endedAt);

        System.out.println("Called only ONCE AFTER ALL tests - " + duration);
    }

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();

        System.out.println("Called BEFORE EACH test - " + Instant.now());
    }

    @AfterEach
    public void tearDown() {
        calculator = null;

        System.out.println("Called AFTER EACH test - " + Instant.now());
    }

    @Test
    public void shouldAddTwoPositiveNumbers() {
        // arrange
        Integer expected = 3;

        // act
        Integer sum = calculator.add(1, 2);

        // assert
        // assertEquals(expected, sum);
        assertThat(sum, is(expected));
    }

    @Test
    public void shouldMultiplyTwoPositiveNumbers() {
        Integer expected = 15;

        Integer product = calculator.times(3, 5);

        // assertEquals(expected, product);
        assertThat(product, is(expected));
    }

    @Test
    public void cosTrigonometricExpressionShouldNotBeSupported() throws UnsupportedOperationException {
        assertThrows(UnsupportedOperationException.class, () -> {
            calculator.cos(0.8);
        });
    }

    @Test
    public void slowCalculationShouldNotTakesMoreThan3Milliseconds() {
        assertTimeout(Duration.ofMillis(3000), () -> {
            calculator.slowCalculation(2000);
        });
    }

}
