/*
 * @Title:   Homework 2
 * @Author:  Benjamin Bunk
 * @Date:    February 18th, 2014
 * Purpose: This program will loop 100 times and on each iteration generate 1
 *          new random number between 0-999 inclusive and add all of the
 *          numbers together to give a final sum at the end.
 */

/**
 * This is the main class for Homework 2.
 */
public final class BenjaminBunkhw2 {

    /**
     * Controls the number of random values.
     * Currently set to {@value}
     */
    public static final int ITERATIONS = 100;

    /**
     * Controls the upper range of random values (exclusive).
     * Currently set to {@value}
     */
    public static final int RANDOM_RANGE = 1000;

    /**
     * Private constructor for our Utility class.
     */
    private BenjaminBunkhw2() {
        // Not Called.
    }

    /**
     *
     * The main entry point to the program.
     *
     * This method encompasses all INPUT/OUTPUT and initiates CALCULATIONS.
     *
     * @param args The array of String arguments passed in at runtime.
     *
     */
    public static void main(final String[] args) {

        int runningTotal = 0;

        /////////////////INPUT SECTION///////////////////////////////

        // Loop to generate 100 random numbers.
        for (int i = 0; i < ITERATIONS; i++) {

            // Get the next random number.
            int current = (int) (Math.random() * RANDOM_RANGE);

            /////////////////CALCULATION SECTION/////////////////////////

            // Add the current random number to the total.
            runningTotal += current;

            /////////////////OUTPUT SECTION//////////////////////////////

            // Output the current number. Width = 3, Zero Padded, Integer, +new line.
            System.out.printf("%03d%n", current);
        }

        // Output the sum.
        System.out.println("Sum of all numbers = " + runningTotal);

    } // End method main.

} // End class BenjaminBunkhw2.
