CMIS141
=======

Collection of code from UMUC CMIS 141.

Grading
=======

1. Does the program compile and run with no errors or warnings?

2. Does the program meet all of the assignments requirements? If the assignment calls for certain output, number of method calls, test plan, calculations, random numbers, dialog boxes, etc., make sure that the program meets all of these requirements.

3. Has a Word doc or docx file containing a screenshot of the program compilation and execution and a test plan plus a .java file of the source code been submitted? 

4. Have sufficient comment lines been inserted into the program? Comment lines indicating program author, date, assignment, and program description, as well as descriptions of program lines/sections should be inserted. The sections of any program are input, calculations, and output.

5. Have blocks of code been indented to make the program easy to read and understand? The outermost (not indented) lines should be lines such as package..., import..., and class declaration. The second level is main(). The third level is any line under main that does not begin a block of code, such as a loop. The fourth level of indentation is any line within a block. Up to 7 or 8 levels are possible.

6. Does the program meet the highest level of quality described in the assignment and project rubric?

7. Have you submitted a doc or docx file with a screenshot showing the successful compilation and esecution of your program? Have you submitted a .java file with the source code of your program?

8. When required, has a comprehensive test plan been included in the docx file, along with a summary of results and a screenshot of at least one case?

Coding Style for this Class
===========================

1. File Description

```java
/**
 * [Assignment Name]
 * [Description of the Program]
 *
 * @author Benjamin Bunk
 * [Name of App]
 * CMIS 141 6980 Introductory Programming (2142)
 * [Date]
 */
```

2. Comments

Comments on the opening and closing braces are encouraged by the professor.

```java
/**
 * The main entry point to the program.
 *
 * This method encompasses all INPUT/OUTPUT.
 * For CALCULATION @see #getMessage()
 *
 * @param args  The array of String arguments passed in at runtime.
 */
public static void main (String[] args) { // This is the beginning of Package.main method.
  // Input/Ouput/Logic Here.
} // End of main method.
```

Test Plans
===

Test plans are used to test computer programs during and after development. A test plan is a set of possible inputs along with their associated expected outputs. A test plan should contain at least 5 sets of possible inputs for programmers in first and second-year programming courses. However, a test plan must contain enough sets of possible inputs to thoroughly test the program and its algorithm. The test plan consists of a table which is broken up into main columns, possible inputs and expected outputs. Within the possible inputs column, there must be subheadings and columns for all of the individual items that are inputted by the user or an external file in the order that they are inputted. Within the expected outputs part of the test plan, you must identify the exact output that prints or displays across from their corresponding entries in the possible inputs column.

When you determine the possible inputs that a user (or a file) may enter, you must think about all of the possible "boundary" cases. Each boundary case should have an entry in the possible inputs column. For example, if the user is expected to enter a Celsius temperature, you should include the lowest legal centrigrade temperature which is -276 degrees. While there is no upper limit to possible Celsius temperatures, you should include the boiling point of water (100 degrees) and maybe another entry higher than that. You should also include "special" cases such as the freezing point of water (0 degrees.) A test plan must also include a few "normal" input cases. If you program includes error-checking (which prevents the user from inputting bad data), you should include a test plan item that simulates bad entry. For example, if the user is supposed to enter an integer, you should include the possible inputs of 4.3 and "zero".

Why are test plans necessary?

All programs must be thoroughly tested before they are sold or submitted for a grade. Do not rush the development of a program and sell it or hand it in before you have tested it. You still have a chance to debug your program if you learn that you have an error from administering the test plan.

How do I write a test plan?

BEFORE you begin to write pseudocode and long before you write any code for the program, you must complete a fully-developed test plan. This is absolutely necessary. If you create the test plan later, coding problems or language issues may prejudice your open-mindedness. That is, you may not find all of the boundary cases or "tricky" inputs if you subconsciously put them out of your mind. It is always necessary to make the test plan by closely examining the program's specifications. 
   `
   Note that you must include a column in your test plan that explains why each test plan item was included. You must also number the test plan items. It is fine and even advisable to list more than one example of each kind of test plan item (i.e. boundary, normal, error-checking, etc.)
   `

Example:

Original Program Specification:   

Write a program that computes the area of a rectangle when the user to input two integer numbers between or including 0 and 20. It will print out the area of the rectangle along with an appropriate message.

Test Plan
---
Test Case | Possible Inputs | Expected Output | Reason
| --- | --- | --- | --- | --- |
| | width | length | | |
1. | 3 | 12 | "The area is 36" | normal case
2. | 0 | 0 | "The area is 0" | lower boundary case
3. | 1 | 0 | "The area is 4" | normal case with least possible nonzero width
4. | 0 | 20 | "The area is 0" | mixed boundary case
5. | 20 | 0 | "The area is 0" | mixed boundary case
6. | -2 | 5 | "Please input another width. " | error-checking
