/*
 * Title:   Unique Method
 * Author:  Benjamin Bunk
 * Date:    February 26th, 2014
 * Purpose: This program has a utility method that will direct output to either
 *          the screen, console, or both depending on a control param to the
 *          method.
 */

package edu.umuc.cmis141.uniquemethod;

import javax.swing.JOptionPane;

/**
 * This is the main class for Unique Method.
 */
public final class UniqueMethod 
{

    /**
     * Direct output to console.
     */
    public static final byte OUTPUT_CONSOLE = 0x01;

    /**
     * Direct output to screen.
     */
    public static final byte OUTPUT_WINDOW = 0x02;

    /**
     * Direct output to screen and console.
     */
    public static final byte OUTPUT_BOTH = 0x03;

    /**
     * Private constructor for our Utility class.
     */
    private UniqueMethod() {
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
    public static void main(final String[] args )
    {

        /////////////////INPUT SECTION//////////////////////////////
        // None.

        /////////////////CALCULATION SECTION/////////////////////////
        // None.

        /////////////////OUTPUT SECTION//////////////////////////////

        // Output to the console.
        UniqueMethod.output(OUTPUT_CONSOLE, "Hello from the console stream.");

        // Output to the window.
        UniqueMethod.output(OUTPUT_WINDOW, "Hello from the swing window. (Not really a stream)");

        // Output to both the console and a window.
        UniqueMethod.output(OUTPUT_BOTH, "Hello from the screen and console.");

    } // End method main.

    /**
     * The output method will direct output to the screen, console, or both.
     * 
     * @param stream Byte representing where output should be directed.
     * @param message String representing the message to be displayed.
     *
     * @see #OUTPUT_BOTH
     * @see #OUTPUT_CONSOLE
     * @see #OUTPUT_WINDOW
     */
    public static void output(final byte stream, String message) {
        // Default is the console output.
        switch (stream) {
            case OUTPUT_BOTH:
                // Fall through on purpose.

            case OUTPUT_WINDOW:
                JOptionPane.showMessageDialog(null, message);

                // Break only if OUTPUT_BOTH is NOT selected.
                if (stream != OUTPUT_BOTH) break;
            default:
                // Default to console.
                System.out.println(message);

                break;
        }
    } // End method output.

} // End class UniqueMethod.
