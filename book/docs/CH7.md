UMUC CMIS141 
Introduction to Java Programming
by Y. Daniel Liang

Chapter 7
===

7.1 Introduction
===

Data in a table or a matric can be represente using a two-dimensional array.

7.2 Two-Dimensional Array Basics
===

An element in a two-dimensional array is accessed through a row and column index.

7.2.1 Declaring Two-Dimensional Arrays
===

The synatx for declaring a two-dimensional array is:

	elementType[][] arrayRefVar;

To create and assign a 5x5 matrix of ints:

	int[][] matrix = new int[5][5];

Array initializers can be used with two-dimensional arrays:

```java
int[][] matrix = {
	{1,2,3},
	{4,5,6},
	{7,8,9}
};

// Equivalent

int[][] matrix = new int[3][3];

matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[0][2] = 3;
matrix[1][0] = 4;
// ...
```

7.2.2 Obtaining the Lengths of Two-Dimensional Arrays
===

A two-dimensional array is actually an array of arrays.

	x.length is the number of rows in the array

	x[0].length is the number of columns in that row of the array.

7.2.3 Ragged Arrays
===

Rows in a two-dimensional array can have different lengths.

To create a ragged array simply remove the second size of the array:

	int[][] matrix = new int[3][];

```java
int[][] triangleArray = {
	{1,2,3,4,5},
	{1,2,3,4},
	{1,2,3},
	{1,2},
	{1}
};

// Equivalent

int[][] triangleArray = new int[3][];

triangleArray[0] = new int[5];
triangleArray[1] = new int[4];
triangleArray[1] = new int[3];
triangleArray[1] = new int[2];
triangleArray[1] = new int[1];
```

The first array must have a size so this would be INCORRECT:

	int[][] matrix = new int[][];

7.4 Passing Two-Dimensional Arrays to Methods
===

When passing a two-dimensional array to a method, the reference of the array is passed to the method. Just like in a one-dimensional array.

Returning a two-dimensional array:
```java
public static int[][] getArray() {
	return new int[5][5];
}
```

Passing in a two-dimensional array:
```java
public static void enterArray(int[][] j) {
	
}
```

7.8 Multidimensional Arrays
===

A two-dimensional array consists of an array of one-dimensional arrays and a three-dimensional array consists of an array of two-dimensional arrays.

In Java you can create n-dimensional arrays for any integer n.

	double[][][] scores = new double[1][4][9];

```java
double[][][] scores = new double[3][2][2];

// Equivalent

double[][][] scores = {
	{
		{1,2},
		{3,4}
	},
	{
		{1,2},
		{3,4}
	},
	{
		{1,2},
		{3,4}
	}
};
```

