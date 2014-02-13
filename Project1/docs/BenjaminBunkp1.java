/*
 * Title:   Project 1
 * Author:  Benjamin Bunk
 * Date:    February 12th, 2014
 * Purpose: This program will take input from the user
 *   (first, last, middle initial, age in years, and 3 lucky numbers) and will
 *   display personalized welcome messages and calculate a lucky average from
 *   the lucky numbers.
 */

import javax.swing.JOptionPane;

/**
 * This is the main class for Project 1.
 */
public final class BenjaminBunkp1 
{
    /**
     * Private constructor for our Utility class.
     */
    private BenjaminBunkp1() {
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
        String userFirst;
        String userMiddle;
        String userLast;
        
        String inputUserAge;
        int userAge;

        String inputLuckyNumber1;
        String inputLuckyNumber2;
        String inputLuckyNumber3;
        double luckyNumber1;
        double luckyNumber2;
        double luckyNumber3;

        double luckyAverage;

        String welcomeMessage;

        /////////////////INPUT SECTION//////////////////////////////
        userFirst = JOptionPane.showInputDialog("What is your first name?");

        userMiddle = JOptionPane.showInputDialog("What is your middle initial?");

        userLast = JOptionPane.showInputDialog("What is your last name?");

        inputUserAge = 
            JOptionPane.showInputDialog("How old are you (in years) ... Don't be shy I'm just a computer!");

        inputLuckyNumber1 = 
            JOptionPane.showInputDialog("What is one of your lucky numbers?");

        inputLuckyNumber2 = 
            JOptionPane.showInputDialog("What is another of your lucky numbers?");

        inputLuckyNumber3 = 
            JOptionPane.showInputDialog("Finally please give us one last lucky number?");

        /////////////////CALCULATION SECTION/////////////////////////
        
        // Validate Input.
        try {
            // Convert age number input into actual number.
            userAge = Integer.parseInt(inputUserAge);

            // Convert lucky number input into actual numbers.
            luckyNumber1 = Double.parseDouble(inputLuckyNumber1);
            luckyNumber2 = Double.parseDouble(inputLuckyNumber2);
            luckyNumber3 = Double.parseDouble(inputLuckyNumber3);    
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "You must only enter a number for the lucky numbers and age questions."
                + "\nPlease re-run this application and try again.");
            return;
        }

        // Caclulate the average of the lucky numbers.
        luckyAverage = (luckyNumber1 + luckyNumber2 + luckyNumber3) / 3.0;

        // Calculate the age based welcome message.
        if (userAge >= 21) {
            welcomeMessage = "Welcome adult!";
        }
        else if (userAge == 20) {
            welcomeMessage = "Welcome almost adult!";
        }
        else if (userAge > 12) {
            welcomeMessage = "Welcome teenager!";
        }
        else if ((userAge <= 12) && (userAge > 0)) {
            welcomeMessage = "You are just a kid!";
        }
        else {
            JOptionPane.showMessageDialog(null, "Age must be a positive non-zero number."
                + "\nPlease re-run this application and try again.");
            return;
        }

        /////////////////OUTPUT SECTION//////////////////////////////

        // Output a message welcoming the user by name.
        JOptionPane.showMessageDialog(null,
            "Welcome " + userFirst + " " + userMiddle + " " + userLast + ".");

        // Output a message welcoming the user by age.
        JOptionPane.showMessageDialog(null, welcomeMessage);

        // Output the average of the 3 lucky numbers.
        JOptionPane.showMessageDialog(null,
            "The average of your 3 lucky numbers (" 
            + luckyNumber1 + ", " + luckyNumber2 + ", " + luckyNumber3
            + ") is: " + luckyAverage);

    } // End method main.

} // End class BenjaminBunkp1.
