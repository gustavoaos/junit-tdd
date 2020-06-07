package com.openclassrooms.testing;

public class ConversionCalculator {

    private double milesToKilometersConversionRate = 1.609;
    private double inchesToCentimetersConversionRate = 2.54;

    public double milesToKilometers(final double miles) {
        return miles * milesToKilometersConversionRate;
    }

    public double inchesToCentimeters(final double inches) {
        return inches * inchesToCentimetersConversionRate;
    }

}
