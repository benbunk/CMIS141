package edu.umuc.cmis141.book.ch3.testbooleanoperators;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

       System.out.println("Enter an integer: ");
       int number = input.nextInt();

       if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
       }

       if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
       }

       if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
       }

       if ((number % 2 == 0) != (number % 3 == 0)) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
       }
	}
}