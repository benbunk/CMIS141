
/*
 * @Title:   Unique Array
 * @Author:  Benjamin Bunk
 * @Date:    March 6th, 2014
 * Purpose: This prgram will randomly generate 10 characters and output them to
 *          the screen. It will use the Array class member length to determine
 *          when it has reached max number of characters to output. The
 *          characters will be between A-Z.
 */

/**
 * This is the main class for Unique Array.
 */
public final class BenjaminBunkUniqueArray {

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

        char[] allChars = new char[10];

        /////////////////INPUT SECTION///////////////////////////////
        // No Input.

        /////////////////CALCULATION SECTION/////////////////////////

        // Use a for loop to assign the ranomd characters to the array.
        for (int i = 0; i < allChars.length; i++) {

            // Randomly generate chars between [A,Z]
            allChars[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
        }

        /////////////////OUTPUT SECTION//////////////////////////////

        // Output the randomly generated characters using a for-each loop.
        for (char u: allChars) {
            System.out.print(u + " ");
        }
        System.out.println("");

    } // End method main.

} // End class BenjaminBunkUniqueArray.
