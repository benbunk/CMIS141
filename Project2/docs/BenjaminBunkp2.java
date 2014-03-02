
/*
 * @Title:   Project 2
 * @Author:  Benjamin Bunk
 * @Date:    March 1st, 2014
 * Purpose: This program will collect numbers as input and display the count,
 *          sum, and average of the entered numbers up to a sum of 100.
 */

import javax.swing.JOptionPane;

/**
 * This is the main class for Project 2.
 */
public final class BenjaminBunkp2 {

    /**
     * Keeps track of the number of inputs.
     * Currently set to {@value}
     */
    private static int count = 0;

    /**
     * Keeps track of the sum of the inputs.
     * Currently set to {@value}
     */
    private static double sum = 0.0;

    /**
     * Private constructor for our Utility class.
     */
    private BenjaminBunkp2() {
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

        double input = 0.0;

        /////////////////INPUT SECTION///////////////////////////////

        // Loop to get input until sentinel value of 999 is read.
        while ( (input = BenjaminBunkp2.getInput()) != 999) {
            // Incrememnt the static class variable Count.
            BenjaminBunkp2.count++;

            // Add the value to the sum.
            BenjaminBunkp2.addToSum(input);
        }

        /////////////////CALCULATION SECTION/////////////////////////

        // Calculate the average to be shown to the user.
        double average = BenjaminBunkp2.getAverage();

        /////////////////OUTPUT SECTION//////////////////////////////

        // Show the results to the user.
        BenjaminBunkp2.showResults(BenjaminBunkp2.count, BenjaminBunkp2.sum, average);

    } // End method main.


    /**
     * Get input from the user with JOptionPane dialog.
     *
     * @return The double value of the user input.
     */
    public static double getInput() {
        // Show Dialog.
        String input = JOptionPane.showInputDialog(null, "Please enter a number (Enter 999 to show results).");

        // Convert to Double.
        Double numericalValue = Double.parseDouble(input);

        // Return result of the conversion for convenience.
        return numericalValue;
    } // End method getInput.

    /**
     * Incremement the sum of all inputs with the given input.
     *
     * @param input Double representing the next value to be added
     *              to @see #BenjmaminBunkp2.sum.
     *
     * @return Sum of all inputs.
     */
    public static double addToSum(double input) {

        // Increment the sum.
        BenjaminBunkp2.sum += input;

        // Return the new value of sum for convenience.
        return BenjaminBunkp2.sum;

    } // End method addToSum.

    /**
     * Return the average of BenjaminBunkp2.sum and BenjaminBunkp2.count.
     *
     * @return average Double representing the average of all inputs.
     */
    public static double getAverage() {
        // Return the average of all inputs.
        return BenjaminBunkp2.sum / BenjaminBunkp2.count;
    } // End method getAverage.

    /**
     * Output the count, sum, and average based on the input into this method.
     * If the sum parameter is greater then 100 output a warning.
     *
     * @param count Integer representing the total count of inputs.
     * @param sum Double representing the sum of the inputs.
     * @param average Double representing the average of the inputs.
     */
    public static void showResults(double count, double sum, double average) {
        if (sum > 100) {
            JOptionPane.showMessageDialog(null, "Values have exceeded a sum of 100.");
        }
        else {
            // Output the count, the sum, and the average.
            JOptionPane.showMessageDialog(null, "Count: " + count
                + ", Sum: " + sum + ", Average: " + average);
        }
    } // End method getAverage.

} // End class BenjaminBunkp2.
