package edu.umuc.cmis141.book.ch6.lottonumbers;

import java.util.Scanner;

public class App {

    public static final int MAX_LOTTO_NUMBER = 99;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defaults to false.
        boolean[] isCovered = new boolean[MAX_LOTTO_NUMBER];

        // Read each number and mark its prescence.
        int number = input.nextInt();
        while (number > 0 && number <= 99) {
            isCovered[number - 1] = true;
            number = input.nextInt();
        }

        // Check if all the numbers were  found.
        boolean allCovered = true;

        // For-each here since were doing the basics.
        for (boolean covered: isCovered) {
            if (!covered) {
                allCovered = false;

                // Return early if we can
                break;
            }
        }

        // Display results.
        if (allCovered) {
            System.out.println("The tickets cover all numbers.");
        }
        else {
            System.out.println("The tickets don't cover all numbers");
        }
    }
}