package edu.umuc.cmis141.homework1;

import java.util.Scanner;

/**
 * Homework1 Assignment.
 *
 * The Homework1 program is built to display the area of a circle.
 *
 * Javadoc Generated Documentation is available:
 * http://benbunk.github.io/CMIS141/Homework1/project-reports.html
 *
 * Homework 1
 * CMIS 141 6980 Introductory Programming (2142)
 * Feb. 7, 2014
 *
 * @author Benjamin Bunk
 * @version 1.0-DEV
 */
public final class BenjaminBunkhw1 {

    /**
     * BejaminBunkhw1 Application Class.
     */

    /**
     * @variable PI Mathematical constant for pi.
     */
    static final double PI = 3.14;

    /**
     * Private constructor for our Utility class.
     */
    private BenjaminBunkhw1() {
        // Not Called.
    }

    /**
     *
     * The main entry point to the program.
     *
     * This method encompasses all INPUT/OUTPUT and initiates CALCULATIONS.
     *
     * @see #getArea(double) getArea(double).
     *
     * @param args The array of String arguments passed in at runtime.
     *
     */
    public static void main(final String[] args) {
        double area;
        double radius = 10;
        
        // Initiate Calculations for the area.
        area = BenjaminBunkhw1.getArea(radius);

        // Output.
        System.out.println(BenjaminBunkhw1.getMessage(radius, area));

    } // End of main method.

    /**
     *
     * Calculate the area of a circle.
     *
     * This method ecompasses all CALCULATIONS.
     *
     * @see #main(String[]) main(String[]).
     * @see Math#pow(double, double) Math.pow(double, double).
     *
     * @param  radius The double representing the radius of the circle who's
     *               area will be calculated.
     *
     * @return The double representing the area of the circle.
     *
     */
    public static double getArea(final double radius) {
        double area;

        // Calculations - Calculate the area of a circle.
        area = PI * Math.pow(radius, 2);

        return area;
    } // End of getArea method.

    /**
     *
     * The message that will be displayed to the end user.
     *
     * @param radius The value of the circles radius.
     * @param area   The value of the circles area.
     *
     * @return The String output.
     *
     */
    public static String getMessage(final double radius, final double area) {
        String message = "";

        // Build the message content.
        if (radius < 0) {
            message += "The radius must be a positive decimal number only.";
        }
        else {
            message += "The area of a circle with a given radius ";
            message += radius + " is " + area;
        }

        return message;
    } // End of getMessage method.

} // End of BenjaminBunkhw1 class.
