package com.openclassrooms.testing;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConversionCalculatorTest {

    private ConversionCalculator conversionCalculatorUnderTest;

    @BeforeEach
    public void setUp() {
        conversionCalculatorUnderTest = new ConversionCalculator();
    }

    @AfterEach
    public void tearDown() {
        conversionCalculatorUnderTest = null;
    }

    @Test
    public void shouldConvertMilesToKilometersWhenMilesIsPositive() {
        double miles = 1.0;
        double kilometers = 1.609;

        double result = conversionCalculatorUnderTest.milesToKilometers(miles);

        assertThat(result, is(kilometers));
    }

    @Test
    public void shouldConvertInchesToCentimetersWhenInchesIsPositive() {
        double inches = 1.0;
        double centimeters = 2.54;

        double result = conversionCalculatorUnderTest.inchesToCentimeters(inches);

        assertThat(result, is(centimeters));
    }
}
