
/*
 * @Title:   Homework 3
 * @Author:  Benjamin Bunk
 * @Date:    March 7th, 2014
 * Purpose: This program  allows a user to enter 10 numbers (double precision)
 *          into an array and then sorts and displays the numbers from lowest
 *          to highest.
 */

package edu.umuc.cmis141.homework3;

import java.util.Scanner;
import java.util.Arrays;

/**
 * This is the main class for Homework3.
 */
public final class BenjaminBunkhw3 {

    /**
     * Maximum number of inputs.
     * Currently set to {@value}
     */
    private static final int MAX_INPUTS = 10;

    /**
     * Private constructor for our Utility class.
     */
    private BenjaminBunkhw3() {
        // Not Called.
    }

    /**
     *
     * The main entry point to the program.
     *
     * This method initiates all INPUT/OUTPUT/CALCULATIONS.
     *
     * @param args The array of String arguments passed in at runtime.
     *
     */
    public static void main(final String[] args) {

        double[] numbers;

        /////////////////INPUT SECTION///////////////////////////////

        // Get the inputs from the user.
        numbers = BenjaminBunkhw3.getInput(BenjaminBunkhw3.MAX_INPUTS);

        /////////////////CALCULATION SECTION/////////////////////////

        // Sort the array.
        BenjaminBunkhw3.sortArray(numbers);

        /////////////////OUTPUT SECTION//////////////////////////////

        // Output the results to the console.
        BenjaminBunkhw3.showResults(numbers);

    } // End method main.

    /**
     * Get input from the user with the console input up to max number
     * of entries.
     *
     * @param max The integer number of inputs to take.
     *
     * @return Return the double array reference to the user input.
     */
    public static double[] getInput(final int max) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[max];

        // Prompt the user.
        System.out.println("Please enter 10 numbers seperated by spaces.");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Return the array of input numbers.
        return numbers;
    } // End method getInput.

    /**
     * Sort an input array.
     *
     * @param numbers Double array reference to sort.
     */
    public static void sortArray(final double[] numbers) {

        // Sort the array.
        Arrays.sort(numbers);

    } // End method sortArray.

    /**
     * Output the sorted user input array.
     *
     * @param numbers Double array reference to the sorted user input array.
     */
    public static void showResults(final double[] numbers) {
        for (double u : numbers) {
            System.out.print(u + " ");
        }

        // Print a blank line to make the console easier to read.
        System.out.println("");

    } // End method showResults.

} // End class BenjaminBunkhw3.
