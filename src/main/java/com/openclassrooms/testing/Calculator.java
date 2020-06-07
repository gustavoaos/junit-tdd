package com.openclassrooms.testing;

/**
 * A high-end calculator implementation.
 * @author gustavoaos
 */
public class Calculator {

    /**
     * Adds the left argument to the right.
     * @param left The first number to be added
     * @param right A number to be added to the left argument
     * @return Returns the sum between the left and right arguments
     */
    public final Integer add(final int left, final int right) {
        return left + right;
    }

    /**
     * Multiplies the left argument by the right.
     * @param left The number to be multiplied
     * @param right A number that indicates how may times the left argument has
     *              to be multiplied
     * @return Returns the product between the left and right arguments
     */
    public final Integer times(final int left, final int right) {
        return left * right;
    }

    /**
     * Only for test purposes.
     * @param angle The angle
     * @throws UnsupportedOperationException Trigonometric expressions aren't supported
     */
    public final void cos(final double angle) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Trigonometric expressions aren't supported");
    }

    /**
     * Only for test purposes.
     * @param milliseconds How many milliseconds it's takes to finish
     *                     the calculation
     */
    public final void slowCalculation(final int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
