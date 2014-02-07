package edu.umuc.cmis141.book.ch2.computeareawithconsoleinput;

import java.util.Scanner;

public final class App {
  
  /**
   * Not called.
   */
  private App() {
  }

  public static void main(final String[] args) {
  
    double radius;
    Scanner input = new Scanner(System.in);
    double area;

    // Input.
    System.out.print("Enter a number for the radius: ");

    try {
      radius = input.nextDouble();  
    }
    catch (java.util.InputMismatchException exception) {
      System.out.println("Try again please.");
      return;
    }

    // Calculate.
    area = radius * radius * 3.14159;
    
    // Output.
    System.out.println("The area for the circle of radius " + radius + " is " + area);
  }

}
