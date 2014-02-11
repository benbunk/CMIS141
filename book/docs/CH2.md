
UMUC CMIS141 
Introduction to Java Programming
by Y. Daniel Liang

Chapter 2
=========

Section 2.2
===

An algorithm determines how a problem is solved by listing the actions that need to be taken and their order.

Symbols represent variables in a program. A variable represents a value stored in memory.
	
For instance:
```java
int x = 1;
```

Data types let the compiler know what the symbol (variable) represent.

  Some PRIMITIVE data types include:
  1. Int
  2. Float
  3. Double
  4. Long
  5. String
  6. byte

Every Variable has:

  1. Name
  2. Type
  3. Size
  4. Value (Undefined until it is assigned)

Reviewing how a program works is called tracing and are useful for finding errors.

The plus sign (+) has two meanings:

1. Addition
2. Concatenating Strings

Strings CAN'T cross lines in source code files.

Section 2.3 Reading Input from the Console
===

Console input is not directly supported by Java. The Scanner class can work around this limitation.

Scanner can read input from System.in as follows:
```java
Scanner input = new Scanner(System.in);
```

2.4 Identifiers
===

Identifiers are the names of elements in the program such as classes, methods, and variables. Identifiers must follow these rules:

1. Must be composed of letters, digits, underscores, and dollar signs.
2. Can start with letters, underscores, and dollar signs. (Not digits) ($ is stylistically reserved for machine generated code).
3. CAN'T be a reserved word (keyword).
4. CAN'T be true, false, or null.
5. Can have any length.

2.5 Variables
===

Variables represent values that can change within the program.

When creating a variable the compiler reserves space equal to the variables data type.

Variables may be declared together in a comma serpated list (but should not be by stylistic convention for readability reasons). For example:
```java
int i, j, k;

int i;
int j;
int k;
```

Variables can be initialized with a value when they are declared. This is also true for variables declared in a comma seperated list. (Again avoid this for style reasons).
```java
int i = 1, j = 2, k = 100;
```

A variable declared in a method must be assigned a value before it can be used. (This rule doesn't apply to class level variables).

A variables must be declared and initialized before it can be used (clearly this contradicts the previous statement see section2_5.App in ch2 code).

2.6 Assignment Statements and Assignment Expressions
===

An assignment statement designatesa a value for a variable. An assignment statement can be used as an expression. (Note look at all the places expressions are allowed for loops are an unexpected example.)

A variable may be used in both sides of the assignment operator (=):
```java
x = x + 1;
```

A double value can't be assigned to an int without Type Casting. The same is not true of the reverse operation; an int can be assigned to a double.

2.7 Named Constants
===

A named constant is an identifier that represents a premanent value.
```java
final datatype CONSTANTNAME = value;
```

A constant must be declared and initialized in the same statement.

Benefits of constants:

1. Reduce typing of the value.
2. Changing the value in a single location.
3. Easier to read if given a descriptive name.

Named constants can contain expressions in their assignment. For example:
```java
final int CIRCUMFERANCE = Math.pow(PI * 1.2, 2);
```

2.8 Naming Conventions
===

1. Use lowercase for variables and methods. If several words exist in the name concatenate them and Capitalize the first letter or the 2nd and subsequent words.
2. Capitalize the first letter of each word in a class name.
3. Capitalize every letter in a constant.

2.9.1 Numeric Types
===

Name | Storage Size
--- | ---
byte | 8-bit signed
short | 16-bit signed
int | 32-bit signed
long | 64-bit signed
float (single precision) | 32-bit IEEE 754
double (double precision) | 64-bit IEEE 754

`IEEE 754 is a standard approved aby the Institue of Electrical and Electronics Engineers for representing floating-point numbers on computers.`

The double class has double the precision of the float class and should normally be used instead of float for accuracy.

When overflow occurs in java it changes the sign of the value because it "overflows" into the signed bit of the memory.

2.9.2 Numeric Operators

When the operands of a division operation are both integars then the result will be an integar (the decimal dropped) even if it's stored in a double datatype. Change either of the operands to a double will effectively combat this.
```java
double result = 5 / 2; // result = 2
double result = 5.0 / 2; // result = 2.5
```

The remainder in modulus operations (%) is only negative if the dividend is negative.

Integar calculations are completely accurate.

Floating point calculations are mostly accurate but they can't store 100% of the precision so they are only as close as their storage limit allows.

2.9 Exponents
===

```java
Math.pow(a, b);
```

2.10 Numeric Literals
===

A literal is a constant that appears directly in a program.

2.10.1 Integar literals
===

An integer literal can be assigned as long as the datatype can hold it. For instance byte x = 128 causes a compiler error.

Integer literals are assumed to be of datatype int. To make sure the compiler processes long literals correctly append an (L) to the end of the number.
```java
  long y = x + 12345678910L;
```

radix | identifier | example
--- | --- | ---
Octal | pre-pend 0 | 0128
Hexidecimal | pre-pend 0x | 0xFFF

2.10.2 Floating-Point Literals
===

By default floating point literals are treated as double datatypes. Append an (F) to make sure it is processed as a float or a (D) for double.

2.10.3 Scientific Notation
===

Scientific notation is supported by appending an (E), a sign (+, -), and a number representing the position/power.
```java
1.2345677E+2
1.2345657E-2
```

2.12 Current Time
===

The current time can be obtained with:
```java
System.currentTimeMillis();
```

2.15 Numeric Type Conversion
===

Ints can be converted to floats automatically. Floats can be converted to ints with an explicit cast.

Narrowing types is allowed but requires a cast statement. A compiler warning is thrown if the cast is not done.
```java
double i = 100.00;
int j = (int)i;
```

Widenning types is allowed and happens automatically.

Augmented expressions of type x1 op= x2 has an implicit cast to the type of x1 (x1 op= x2 || x1 = (T)(x1 op x2)) so the following is valid and results in an integer value:
```java
int x = 1;
x += 4.5;
```

2.16 Software Development Lifecycle
===

The software development lifecycle is a multi-stage process that includes:

1. Requirements Specification
2. System Analysis
3. System Design
4. Implementation
5. Testing
6. Deployment
7. Maintenance

2.17 Character Data Types and Operations
===

A string literal is enclosed in "" and character literals are enclosed in ''.

2.17.1 Unicode ASCII code.
===

ASCII characters are the original 16 bit or 65,536 characters the char type was intended for. 

Unicode adds support for 1,112,064 characters. Anything beyond the original 16-bit char's are condisered supplmentary char's.

Java supports Unicode supplmentary char's.

16 bit unicode is constructed with:

1. Two  bytes
2. preceded by \u
3. expressed as four hexadecimal digits.

```java
// Welcome in Chinese.
String welcome = "\u6b22\u8FCE";

//Equivalent
char letter1 = 'a';
char letter2 = '\u0041';
```

2.17.2 Casting between char and Numeric types
===

char can be cast into any numeric type.

When an integer is cast into a char only the lower 16 bits are cast.
Example:

```java
char ch = (char)0xAB0041; // The lower 16 bits hex code 0041 is assigned to ch.
System.out.println(ch);   // ch is character A
```

Floating points are first cast to an int and then into char.

When casting from char to into a numeric type it uses the Unicode number.

Casting is implicit between char and any number that can hold the value but must be explicit when casting a char with a value larger then the number being casted into.

2.18 String Type
===

String is not a primitive in Java. It is considered a reference type.

2.19 Input Dialogs
===

```java
//Basic.
String input = JOptionPane.showInputDialog("Enter an input");

//Complicated.
String input = JOptionPane.showInputDialog(null, "Enter an input", "Input Dialog Title", JOptionPane.QUESTION_MESSAGE);
```

2.19.1 Converting Strings to Numbers
===

To convert strings into numbers use the Integer.parseInt() method. 

Other methods include Double.parseDouble().



