/*
 * Title:   Week 3 Discussion
 * Author:  Benjamin Bunk
 * Date:    February 18, 2014
 * Purpose: This program will take in the number of glasses of water I drink 
 *          each day and determine if I am drinking enough each week.
 */

package edu.umuc.cmis141.watercount;

import javax.swing.JOptionPane;

/**
 * This is the main class for Week 3 Discussion.
 */
public final class WaterCount
{

    /**
     *
     * The main entry point to the program.
     *
     * This method encompasses all INPUT/OUTPUT and initiates CALCULATIONS.
     *
     * @param args The array of String arguments passed in at runtime.
     *
     */
    public static void main(final String[] args )
    {
        // Loop-continuation-condition.
        int    i              = 1;
        int    totalGlasses   = 0;
        double averageGlasses = 0.0;

 
        // Begin input loop.
        do {
            /////////////////INPUT SECTION//////////////////////////////
            String input = JOptionPane.showInputDialog(
                "Please enter the number of glasses of water consumed on day " + i);

            
            /////////////////CALCULATION SECTION/////////////////////////

            // Attempt to convert the string entered into an int.
            int currentGlasses;
            try {
                currentGlasses = Integer.parseInt(input);
                if (currentGlasses <= 0) {
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException e) {
                // If there is a problem, prompt the user, start from the beginning.
                JOptionPane.showMessageDialog(null, "Input a positive whole number please.");

                // Skip the rest of the loop and continue from the beginning.
                continue;
            }

            // Add the glasses for this day to the running total.
            totalGlasses += currentGlasses;

            // Incremement the counter for the loop.
            i++;

        } while (i <= 7); // End input loop.

        // Calculate the average for the week.
        averageGlasses = totalGlasses / 7.0;


        /////////////////OUTPUT SECTION//////////////////////////////
        if (averageGlasses > 6.0) {
            // User is drinking too much.
            JOptionPane.showMessageDialog(null, "You're drinking too much (6 a day is good).");
        }
        else if (averageGlasses < 6.0) {
            // User isn't drinking enough.
            JOptionPane.showMessageDialog(null, "You're drinking too little (6 a day is good).");
        }
        else {
            // User is just right.
            JOptionPane.showMessageDialog(null, "You're drinking just the right amount.");
        }

    } // End method main.

} // End class WaterCount.
