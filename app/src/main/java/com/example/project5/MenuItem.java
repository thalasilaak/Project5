package com.example.project5;

/**
 * Interface for Coffee and Donut.
 *
 * @author Ishaan Keswani, Akhil Thalasila
 */
abstract class MenuItem {

    /**
     * Returns the item price.
     * @return item price as a double.
     */
    public abstract double itemPrice();

    /**
     * Returns the string.
     * @return a generated string.
     */
    public abstract String toString();

    /**
     * Checks if two values are equal to each other.
     * @param menu the item to be checked for equivalency.
     * @return true if the items are equal, false otherwise.
     */
    public abstract boolean equals(MenuItem menu);
}
