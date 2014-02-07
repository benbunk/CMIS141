package edu.umuc.cmis141.book.ch2.computeaverage;

import java.util.Scanner;

public final class App {

  /**
   * Not used.
   */
  private App() {
  }

  public static void main(final String[] args) {
    double number1;
    double number2;
    double number3;
    Scanner input = new Scanner(System.in);
    double average;

    // Input.
    System.out.print("Enter three numbers: ");
    try {
      number1 = input.nextDouble();
      number2 = input.nextDouble();
      number3 = input.nextDouble();  
    }
    catch (java.util.InputMismatchException e) {
      System.out.println("Input not a number. Try again.");
      return;
    }

    // Compute.
    average = (number1 + number2 + number3) / 3;

    // Output.
    System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    
  }

}