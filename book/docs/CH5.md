5.1 Introduction
===

Methods can be used to define reusable code and organize and simplify code.

5.2 Method Definition
===

A method definition consists of its method name, parameters, return value type, and body.

```java
modifier returnValueType methodName (list of parameters) {
	// Method body.
}
```

1. Method Signature - The name of the method and the parameter list.
2. Method Header - modifiers, return value type, name, and parameters.
3. Method Body - Anything inside the braces.

A method that returns a value is called a value-returning method. Otherwise it is called a void method.

Methods don't have to have parameters. For instance the Math.random() method.

Value-returning methods are usually called as a part of assigning a value but can also be called as a statement if the return value isn't desired.

A return statement is required for a value-returning method.

5.3 Calling a method
===

Each time a method in invoked the system creates an activation record (also called an activation frame) that stores parameters and variables for the method and places the activation record in an area of memory known as a call stack.

Call stack psuedonyms:

1. Call Stack
2. Execution Stack
3. Runtime Stack
4. Machine Stack
5. "The" Stack

The stack is a last-in-first-out ordering.

5.4 void Method Example
===

The return statement can be used in a void method even if it isn't required to circumvent normal flow control.

```java
public static void testMethod (int i) {
  if (i < 100) {
    return;
  }
  System.out.println("I is big enough.");
}
```

5.5 Passing Parameters by Value
===

Java uses parameter order association. This means the arguments passed to a method must match in the following ways:

1. Order
2. Number
3. Compatible Type

Compatible type means that passing an int to a double is OK without explicitly casting it.

Pass by Value - When a method is invoked the value of the argument is passed to the parameter. If the argument is a variable instead of a literal the value of the variable is copied and the original variable is not modified in any way.

The parameter's variable is allocated when the method is invoked and destroyed when it returns to the caller (removed from the stack).

5.6 Modularizing Code
===

Modularizing makes the code easy to maintian and debug and enables the code to be reused. (Also unit tested).

Advantages of modularizing:

1. Isolates the problem of computing. The logic becomes clear and the program is easier to read.
2. Erros in the computation are confined only to the method responsible. Narrows debugging scope.
3. Method can be reused.

5.8 Overloading Methods
===

Overloading methods enables you to define the methods with the same name as long as their signatures are different.

```java
// All these methods are correct and valid in the same program.
public static void max (int num1, int num2) {}

public static void max (int num1, int num2, int num3) {}

public static void max (int num1, int num2, int num3, int num4) {}
```

If a method exists for two implicitly castable types for instance (int to double) then the compiler will select the most valid method. Example:

```java
max(12, 13);

// This method will be selected.
public static void max (int num1, int num2) {}

// This won't be selected because int, int is a closer match to the caller.
public static void max (double num1, double num2) {}
```

5.9 Variable Scope
===

The scope is the part of the program where the variable can be referenced.

A local variable is a variable declared in method. A parameter is actually a local variable. Local variables are available anywhere from their declaration to the end of the method.

A local variable must be defined and declared a value before it can be used. (We learned this in chapter 2).

A variable declared in a for-loops header is only available within the for-loop until it ends.

A variable declared in the body of the loop is only available to the end of that iteration.

A variable can be redeclared inside any block body but not inside a nested block.



