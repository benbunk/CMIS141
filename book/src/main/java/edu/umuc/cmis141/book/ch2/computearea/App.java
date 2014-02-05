package edu.umuc.cmis141.book.ch2.computearea;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      double radius;

      double area;

      // Step 1: Read in radius.
      radius = 20; 
      // Step 2: Compute area.
      area = radius * radius * 3.14159;
      // Step 3: Display area.
      System.out.println("area of radius " + radius + " = " + area);
      JOptionPane.showMessageDialog(null, "Area of radius " + radius + " = " + area, "Area of a circle.",  JOptionPane.INFORMATION_MESSAGE);
    }
}
