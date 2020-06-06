package com.openclassrooms.testing;

public class Calculator {

    public Integer add(int firstTerm, int secondTerm) {
        return firstTerm + secondTerm;
    }

    public Integer times(int firstFactor, int secondFactor) {
        return firstFactor * secondFactor;
    }

    public void cos(double value) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Trigonometric expressions are not supported");
    }
}
