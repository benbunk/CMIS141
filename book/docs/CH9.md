UMUC CMIS141 
Introduction to Java Programming
by Y. Daniel Liang

Chapter 9
===

9.1 Introduction
===

The classes String, StringBuilder, and StringBuffer are used for processing strings.

9.2 String Class
===

The String object is immutabl: It's content cannot be changed once the string is created.

This means a new "copy" must be made if the string must be modified.

9.2.1 Constructing a String
===

Java treats a string literal as a String object. Making the following examples equivalent.

```java

// String literal
String myString = "Welcome home.";

// Equivalent to...

// String object
String myString = new String("Welcome home.");
```

9.2.2 Immutable Strings and Interned Strings
===

A String object is immutable; its contents cannot be changed.

The value of a String cannot be changed. If you use the same variable to store different String values then the old value will still exist but will no longer be accessible because it no longer has a reference variable to access it.

The garbage collector will eventually clean these up but it can take up significant memory until that happens if not careful in large operations.

Interned Strings help the JVM save some memory so two identical Strings will reference the same memory space.

9.2.3 String Comparison
===

To compare two strings the == operator will tell you if the two variables reference the same object. However to check that the contents of the String are equal. Use the .equals() method.

9.2.9 Conversion between Strings and Arrays
===

Strings are not arrays, but a string can be converted to an array, and vice versa. To convert a string into an array use toCharArray().
	
	char[] chars = "Java".toCharArray();

9.2.10 COnverting Characters and Numeric Values to Strings
===

The static valueOf() method is overloaded and can convert primitive types into a String object. 

The opposite is possible using classes like Double.parseDouble(str) and Integer.parseInt(str).

9.2.11 Formatting Strings
===

You can get a formatted string by calling the static String.format() method. This method is the same as System.out.printf() except that it returns a String object instead of printing it directly.

9.6 StringBuilder, StringBuffer
===

The StringBuffer class should be used in concurrent programming. The StringBuilder class can be used in normal programming.

StringBuilder only returns a reference to it's object, not the String itself.

