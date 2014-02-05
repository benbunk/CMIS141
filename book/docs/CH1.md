UMUC CMIS141 
Introduction to Java Programming
by Y. Daniel Liang

Chapter 1
=========

Section 1.4.3
===

Multiprogramming

  Running multiple programs at the same time when the CPU would be otherwise idle.

Multithreading

   Allowing the same program to do multiple tasks at the same time.

Multiprocessing / Parallel Programming

   Uses two or more processors to perform subtasks and then combine the results into a single solution.

Section 1.7
===

Java programs are executed from the main method in a class.

Class names start with an UPPER CASE letter.

A method is a construct that contains statements.

A string must be encapsulated in "" characters.

A statement must end with a ; character also known as a statement terminator.

Reserved words or key words have special meaning to the compiler and cant be used for anything else. (ex - class, public, static, void)

Comments are for programmers and ignored by the compiler.
// line comment
/* block comment */

Blocks group the program's components. A block always begins and ends with { and }. A class always has a class block and a method has a method block. Blocks can be embedded inside of eachother.

Java is case sensitive.

There are special characters in Java.
//, {}, [], ()

Section 1.8
===

Java is saved to .java files and compiled to .class files to be executed by the JVM.

To execute Java programs you must do the following:

  1. Write a .java file.
  2. Compile the .java file into a .class file.
  3. Execute the .class file in the jvm.

The .java file must have the exact same name as the Class containing the public class name.

The compiler outputs Java Bytecode to the .class file if there are no syntax errors.

Thanks to the JVM Java Bytecode can run on a variety of hardware and software platforms as long as there is a compatible JVM.

Section 1.9
===

The static showMessageDialog(null, "") method of the JOptionPane class can be used to display a graphical message dialog box. It is found in the javax.swing.JOptionPane package.

There are two types of import statements (no performance difference between them):

  1. Wild card import (javax.swing.*)
  2. Specific import (javax.swing.JOptionPane)

java.lang package is imported automatically for all programs.

Section 1.10.1
===

Javadoc comments begin with /** and end with */

Section 1.10.2
===

Indentation is used to clearly illustrate structural relationships between a programs components.

Section 1.10.3
===

Two types of block styles exist.

  1. Next-line style
  ```java
  public class
  {

    public static void main (String [] args)
    {
    	// Code.
    }

  }
  ```

  2. End-of-line style (used by Java api and book)
  ```Java
  public class {

    public static void main (String [] args) {
    	// Code.
    }

  }
  ```

Section 1.11.2 Runtime Errors
===

Runtime errors are typical Input Errors such as entering the wrong datatype. Another example is division by zero errors.

Section 1.11.3 Logic Errors
===

Logic errors occur at runtime but because of a mistake in the programming. An example is 9/5 yielding 1 because the fraction is truncated. This is because division between integars always yields an integar. Instead division should be 9.0 / 5 which will give a double/float result. Logic errors can be very challenging.



