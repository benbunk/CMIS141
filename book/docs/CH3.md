3.1 boolean Data Type
===

A boolean data type declares a variable with the value either true or false.

true and false are literals just like a number such as 10. They are reserved words and cannot be used as identifiers either.

3.3 if statements
===

The block braces in an if statement can be omitted if they enclose only a single statement.
For example: 

```java
if (i > 0) {
	System.out.println("Hi");
}

// Equivalent.
if (i > 0)
	System.out.println("Hi");

// Equivalent.
if (i > 0) System.out.println("Hi");
```

3.5 if-else
===

An if-else statement deciddes which statement to execute based on whether the condition is true of false.

3.6 Nested if-else
===

An if statement can be inside another if statement to form a nested if statement.

Instead of heavily nested multi-way if statements use the if-else if syntax. This notation avoids deep indentation and makes the program easier to read and is the preferred coding style.

```java
if (score >= 100) {
	System.out.printn("A+");
}
else if (score >= 90) {
	System.out.printn("A");
}
else if (score >= 80) {
	System.out.printn("B");
}
else {
	System.out.printn("F");
}
```

3.7 Common Errors in Selection Statements
===

Forgetting braces, ending if statement in the wrong place, mistaking == for =, and dangling else clauses are common errors.

3.8 Generating Random Numbers
===

Math.random() to obtain a random double value between 0.0 and 1.0 (1.0 excluded).

	0.0 <= d < 1.0

```java
	// Generate a random number between 1-10.
	int number1 = (int)(Math.random() * 10);
```

3.11 Logical Operators
===

Boolean Operators
Operator Name Description
--- | --- | ---
! | not | logical negation
&& | and
|| | or | logical or
^ | exclusive or | logical exclusion

The exclusive or operator is ^

This is similar to != but saves time by not requiring extra parenthesis to prevent errors. For example:

```java
// The following statements are equivalent.

if (number % 2 == 0 ^ number % 3 == 0) {
    System.out.println(number + " is divisible by 2 or 3, but not both.");
}

if ((number % 2 == 0) != (number % 3 == 0)) {
    System.out.println(number + " is divisible by 2 or 3, but not both.");
}

// But this statement is not equivalent because != is a comparison operator and not a boolean operator.
if (number % 2 == 0 != number % 3 == 0) {
    System.out.println(number + " is divisible by 2 or 3, but not both.");
}
```

3.14 Switch Statements
===

The switch statement must yield a value:

1. char
2. byte
3. short
4. int
5. String (new in jdk 7)

3.15 Conditional expressions
===

A conditional expression evaluates an expression based on a condition.

Because logical and relational operators will always evaluate to true or false, the results of using a conditional operator can be stored in a boolean variable.

It is in the form of:

```java
  int a = (c > b) ? 1 : 10;
```

It is also known as a ternary operator because it has three operands using ? and :

3.16 Formatting Console output.
===

System.out.printf is used to format output on the console.

A format specifier is in the form of: %4.2f where 4 is the field width, 2 is the precision, f is the conversion code.

A negative sign will left justify the output: %-4.2f

Width is automatically increased for output that is longer then intended.

To output a % instead of using it as a format specifier use %%. (Instead of slash?)

```java
  System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
  // ____1234____Java_____5.6
```

Quick Start Guide - 
    http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf

3.18 Confirmation Dialogs
===

You can use a confirmation dialog to obtain a confirmation from the user.

```java
int option = JOptionPane.showConfirmationDialog(null, "Continue");
```

Option values include:

1. JOptionPane.YES_OPTION == 0
2. JOptionPane.NO_OPTION == 1
3. JOptionPane.CANCEL_OPTION == 2

