package com.openclassrooms.testing;

public class ConversionCalculator {

    private double milesToKilometersConversionRate = 1.609;

    public double milesToKilometers(double miles) {
        return miles * milesToKilometersConversionRate;
    }
}
