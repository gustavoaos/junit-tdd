package com.openclassrooms.testing;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Tag("ConversionTests")
@DisplayName("We should be able to convert between different units.")
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

    @Nested
    @Tag("MetricSystemTests")
    @DisplayName("We should be able to convert to metric system units.")
    class MetricSystemTests {
        @Test
        @Tag("MilesTests")
        @DisplayName("Given one mile when converted to kilometers " +
                "with four decimal cases then the result should be 1.609 kilometers.")
        public void shouldConvertMilesToKilometersWhenMilesIsPositive() {
            double miles = 1.0;
            double kilometers = 1.609;

            double result = conversionCalculatorUnderTest.milesToKilometers(miles);

            assertThat(result, is(kilometers));
        }

        @Test
        @Tag("InchesTests")
        @DisplayName("Given one inch when converted to centimeters " +
                "with two decimal cases then the result should be 2.54 centimeters.")
        public void shouldConvertInchesToCentimetersWhenInchesIsPositive() {
            double inches = 1.0;
            double centimeters = 2.54;

            double result = conversionCalculatorUnderTest.inchesToCentimeters(inches);

            assertThat(result, is(centimeters));
        }
    }
}
