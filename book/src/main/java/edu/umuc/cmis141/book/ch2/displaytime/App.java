package edu.umuc.cmis141.book.ch2.displaytime;

import java.util.Scanner;

public class App {

  private App() {
    // Not used.
  }

  public static void main(final String[] args) {
    int seconds;
    int minutes;
    int remainingSeconds;
    Scanner input = new Scanner(System.in);

    // Input.
    System.out.println("Enter an integar for seconds: ");
    try {
      seconds = input.nextInt();
    }
    catch (java.util.InputMismatchException e) {
      System.out.println("Input of incorrect type, must be an integar.");
      return;
    }
    
    // Compute.
    minutes = seconds / 60;
    remainingSeconds = seconds % 60;

    // Output.
    System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
  }

}