
UMUC CMIS141 
Introduction to Java Programming
by Y. Daniel Liang

Chapter 6
===

6.1 Introduction
===

The array stores a fixed-size sequential collection of elements of the same type.

6.2 Array Basics
===

Once an array is created, its size is fixed. An array reference variable is used to access the elements in an array using an index.

6.2.1 Declaring Array Variables
===

You must declare a variable to reference the array with. The elementType can be any type. The c-style for declaring arrays is technically valid but discouraged.

```java
// Preferred Style
elementType[] arrayRefVar;

double[] myList;

// C Style that is techincally valid
elementType arrayRefVar[];

double myList[];
```

6.2.2 Creating Arrays
===

1. Unlike primitives the array declaration doesn't reserve any space in memmory.
2. Only a storage location for referencing the array is created.
3. Before the array is created the array reference variable will have a value of null.
4. An array must be created before it can be assigned values.
5. Arrays are created with the new operator.

```java
// 1. Create the array reference variable.
// 2. Create an array of a specific size.
// 3. Assign the array to the reference variable.
elementType[] arrayRefVar = new elementType[arraySize];

double[] myList = new double[10];
```

To assign values to the elements of an array use the array reference with the specific element in the brackets.

```java
arrayRefVar[index] = value;

myList[0] = 12.1;
myList[1] = 13.7;
// ...
```

6.2.3 Array Size and Default Values
===

When a new array is created and space is allocated the size must be given by specifying the number of elements the array must be able to hold. Size of an array can be obtained after it is created with arrayRefVar.length.

```java
if (arrayRefVar.length > 10) {
  // do something special with the array.
}
```

When arrays are created with primitive types their default values are:

1. Boolean = FALSE
2. Char = \u0000
3. Number = 0

6.2.5 Array Initializers
===

There is a short hand notation known as array initializer which combines declaration, creation, and initialization of the array.

```java
elementType[] arrayRefVar = {value0, value1, value2, value3};

double[] myList = {12.1, 13.7, 15.2};

// Above and below are equivalent.
double[] myList = new double[3];
myList[0] = 12.1;
myList[1] = 13.7;
myList[2] = 15.2;

// This is a syntax error though.
double[] myList;
myList = {1, 2, 3};
```

6.2.6 Processing Arrays
===

For loops are typically used for processing arrays.
1. All elements are sequential and of the same type.
2. The size of the array is known so for-loops are natural.

```java
int[] myList = new int[10];

for (int i = 0; i < myList.length; i++) {
	myList[i] = Math.random() * 100;
}
```

Char arrays are special when being output because you can simplify the statement.

```java
char[] myList = {'H', 'E', 'L', 'L', 'O'};

// Display HELLO
System.out.println(myList);
```

6.2.7 for-each Loops
===

The for-each loop lets you traverse an array sequentially without the need for an index.

```java
for (elementType element: arrayRefVar) {
	// Do something.
}

for (double u: myList) {
	System.out.println(u);
}

// Equivalent to
for (int u = 0; u < myList.length; u++) {
	System.out.println(myList[u]);
}
```

6.5 Copying Arrays
===

To copy the contents of one array into another, you have to copy the array's individual elements into the other array.

The assignment of one array reference to another only copies the location of the array for which the variable is a reference of. Meaning both variables will point to the exact same array in memory.

	arrayRef1 = arrayRef2

There are three ways to copy array contents:

1. Loop and copy each individual element.
2. Use the static arraycopy method in the System class. (java.lang.System)
3. Use the clone method.

If using arraycopy you must first create the array for target.

```java
System.arraycopy(sourceArray, src_pos, targetArray, tar_pos, length);
```

6.6 Passing Arrays to Methods
===

When passing an array to a method, the reference of the array is passed to the method.

This can be called pass-by-sharing as the values of the array are NOT copied and installed only the pointer to the array is passed into the method.

	Any changes to an array in a method will affect the original array.

	The array is NOT copied like other primitive types would be.

Anonymous arrays can be used to pass array values to a method without first declaring a reference variable.

```java
printArray(new int[]{3, 2, 1, 6, 4, 7});
```

	Arrays are objects in Java.

@todo - Ben - Lookup how if arrays are just objects they can appear as primitive types.
@todo - Ben - Can other objects give special meaning to the brackets [] or other characters?

6.7 Returning an Array from a method
===

When a method returns an array, the reference of the array is returned.

6.9 Variable-Length Argument Lists
===

A variable number of arguments of the same type can be passed to a method and treated as an array.

The method must be declared with a special definition:
	
	typeName... parameterName

The type is followed by an ellipsis (...). Only one variable length param is allowed and it must be declared last in the list of parameteres.

```java
public static void printMax(double... numbers) {}

// Above method can be called with either parameters or a single array.
printMax(1, 2, 3, 4, 5);
printMax(new double[]{1, 2, 3, 4, 5});
```

6.10 Searching Arrays
===

If an array is sorted, binary search is more efficient than linear search for finding an element in the array.

6.10.2 Binary Search
===

For binary search to work the array must already be sorted.

6.11 Sorting Arrays
===

There are many strategies for sorting elements in an array. Selection sort and insertion sort are two common approaches.

Selection sort finds the smallest number and swaps its position with the first position in the array and this continues down the line.

Insertion sort works by repeatedly inserting elements into a sub list.

6.12 The Arrays Class
===

The java.util.Arrays class contains useful methods for common array operations such as sorting and searching.

The java.util.Arrays class contains various static methods for sorting, searching, comparing, filling, and returning a string representation of arrays. The methods are overloaded for all primitive types.

java.util.Arrays.equals(array1, array2) will compare the contents of two arrays.


