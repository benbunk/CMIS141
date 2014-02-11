package edu.umuc.cmis141.book.computeloan;

import java.util.Scanner;

public class App {

    public static void main(final String[] args) {
        // Create a Scanner.
        Scanner input = new Scanner(System.in);

        // Enter the annual interest rate in percentage, e.g. 7.25%
        System.out.println("Enter the annual interest rate, e.g., 7.25%: ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years.
        System.out.println("Enter the number of years as an integer, e.g., 5: ");
        int numberOfYears = input.nextInt();

        // Enter loan amount.
        System.out.println("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();

        // Calculate Payment
        double monthlyPayment = loanAmount * monthlyInterestRate / 
            (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display Results.
        System.out.println("The monthly payment is $" 
            + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $"
            + (int)(totalPayment * 100) / 100.0);
    }
}